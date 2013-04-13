package com.chinasofti.service.workflow.action;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import com.chinasofti.service.workflow.IFirDoService;

public class ThiDoService implements IFirDoService {

	public String firDo(int procid, int taskid, String decide) {
		// TODO Auto-generated method stub
		String result = "finish";
		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();
		
		ProcessInstance wProcessInstance=null;
		TaskInstance wTaskInstance=null;
		Session session = null;	

		ProcessInstance pInstance = jb.getProcessInstance(procid);
		TaskInstance taskInstance = jb.getTaskInstance(taskid);
		int pid = (Integer) taskInstance.getVariable("proid");
		if (decide.equals("1")) {
			// end之后也会向下走一步
			if (taskInstance.hasEnded() || pInstance.hasEnded())
				result = "done";
			else {
				taskInstance.end();
				
				if (pInstance.hasEnded()) {

					TaskMgmtSession tms = jb.getTaskMgmtSession();
					ProcessInstance processInstance = null;
					TaskInstance iaInstance = null;
					List<?> list = tms.findTaskInstances("chief3");
					Iterator<?> iterator = list.iterator();

					while (iterator.hasNext()) {

						iaInstance = (TaskInstance) iterator.next();

						processInstance = jb.getProcessInstance(iaInstance
								.getToken().getId());

						if (processInstance != null
								&& !processInstance.hasEnded()) {

							if (pid == (Integer) iaInstance.getVariable("proid")
									&& (Integer) iaInstance
											.getVariable("state") - 10 == 5) {

								iaInstance.setVariable("state", 16);
								jb.save(iaInstance);

								// request.getSession().setAttribute("content", content);
								// request.getSession().setAttribute("processid", processid);
								// request.getSession().setAttribute("taskid",
								// iaInstance.getId());
							}
						}

					}

				}
				
				
				
			}
			// pInstance.signal();
		} else {

			if (pInstance.hasEnded())
				result = "done";
			else {
				taskInstance.end();
				pInstance.end();

				if (pInstance.hasEnded()) {

					TaskMgmtSession tms = jb.getTaskMgmtSession();
					ProcessInstance processInstance = null;
					TaskInstance iaInstance = null;
					List<?> list = tms.findTaskInstances("chief3");
					Iterator<?> iterator = list.iterator();

					while (iterator.hasNext()) {

						iaInstance = (TaskInstance) iterator.next();

						processInstance = jb.getProcessInstance(iaInstance
								.getToken().getId());

						if (processInstance != null
								&& !processInstance.hasEnded()) {

							if (pid == (Integer) iaInstance.getVariable("proid")
									&& (Integer) iaInstance
											.getVariable("state") - 10 == 5) {

								iaInstance.setVariable("state", 50);
								jb.save(iaInstance);
								
								
								//需要回流，采用重新生成方式实现
								try {
									
									session = jb.getSessionFactory().openSession();	
									session.beginTransaction();
									ProcessDefinition pDefinition = jb.getGraphSession().findLatestProcessDefinition("mypro");
									wProcessInstance = pDefinition.createProcessInstance();
									wProcessInstance.signal();
									wTaskInstance=(TaskInstance)wProcessInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
									wTaskInstance.setVariable("proid", (Integer)taskInstance.getVariable("proid"));
									wTaskInstance.setVariable("state", 14);
									wTaskInstance.setVariable("processid", wProcessInstance.getId());
									wTaskInstance.setVariable("date", (String)taskInstance.getVariable("date"));
									wTaskInstance.setVariable("proname", (String)taskInstance.getVariable("proname"));
									wTaskInstance.setVariable("uid", (Integer)taskInstance.getVariable("uid"));
									wProcessInstance.signal();
									wProcessInstance.signal();
									wProcessInstance.signal();
									jb.save(wProcessInstance);
									jb.save(wTaskInstance);
									
								
									
									
									
								}catch (Exception e) {
									session.getTransaction().rollback();
									e.printStackTrace();
								} finally {
									if (session!=null) {
										session.close();
									}		
								}
								
							

								// request.getSession().setAttribute("content", content);
								// request.getSession().setAttribute("processid", processid);
								// request.getSession().setAttribute("taskid",
								// iaInstance.getId());
							}
						}

					}

				}

			}
		}

		jb.save(pInstance);
		jb.save(taskInstance);
		jb.close();

		return result;

	}
}
