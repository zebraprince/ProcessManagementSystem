package com.chinasofti.service.workflow.action;

import java.util.Iterator;
import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;

import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import com.chinasofti.service.workflow.IFirDoService;

public class FirDoService implements IFirDoService {

	public String firDo(int procid, int taskid, String decide) {
		// TODO Auto-generated method stub
		String result = "finish";
		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();

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
					List<?> list = tms.findTaskInstances("chief1");
					Iterator<?> iterator = list.iterator();

					while (iterator.hasNext()) {

						iaInstance = (TaskInstance) iterator.next();

						processInstance = jb.getProcessInstance(iaInstance
								.getToken().getId());

						if (processInstance != null
								&& !processInstance.hasEnded()) {

							if (pid == (Integer) iaInstance.getVariable("proid")
									&& (Integer) iaInstance
											.getVariable("state") - 10 == 1) {

								iaInstance.setVariable("state", 12);
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
					List<?> list = tms.findTaskInstances("chief1");
					Iterator<?> iterator = list.iterator();

					while (iterator.hasNext()) {

						iaInstance = (TaskInstance) iterator.next();

						processInstance = jb.getProcessInstance(iaInstance
								.getToken().getId());

						if (processInstance != null
								&& !processInstance.hasEnded()) {

							if (pid == (Integer) iaInstance.getVariable("proid")
									&& (Integer) iaInstance
											.getVariable("state") - 10 == 1) {

								iaInstance.setVariable("state", 30);
								iaInstance.end();
								processInstance.end();
								jb.save(processInstance);
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
		}

		jb.save(pInstance);
		jb.save(taskInstance);
		jb.close();

		return result;

	}
}
