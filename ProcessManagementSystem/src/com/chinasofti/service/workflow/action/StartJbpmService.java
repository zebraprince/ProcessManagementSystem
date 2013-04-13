package com.chinasofti.service.workflow.action;

import org.hibernate.Session;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import com.chinasofti.service.workflow.IStartJbpmService;

public class StartJbpmService implements IStartJbpmService{
	
	
	public void startJbpm(int processId ,int state,String date,String proname,int uid){
		
		
		
		
		JbpmContext jbpmContext = null;
		Session session = null;	
		ProcessInstance pInstance = null;
		TaskInstance taskInstance = null;
		
		//下面为工程关联信息
	
		ProcessInstance wProcessInstance=null;
		TaskInstance wTaskInstance=null;
		
		
		JbpmConfiguration jbpmConfiguration = JbpmConfiguration.getInstance();
		try {
			
			jbpmContext = jbpmConfiguration.createJbpmContext();
		
			session = jbpmContext.getSessionFactory().openSession();
		
			
//			SessionFactory factory = new Configuration().configure().buildSessionFactory();
//			session = factory.openSession();
			session.beginTransaction();
			//查找最新版本流程实例并创建流程实例
			ProcessDefinition pDefinition = jbpmContext.getGraphSession().findLatestProcessDefinition("mypro");

			
			pInstance = pDefinition.createProcessInstance();
			
		
			
			//开启流程也就是让start开始流向下一个节点。
			pInstance.signal();
			taskInstance = (TaskInstance)pInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
            taskInstance.setVariable("proid",processId);
            
            System.out.println(state+"yjcyjcyjcyjcyjchahahaha");
            taskInstance.setVariable("state", state);
			taskInstance.setVariable("processid", pInstance.getId());
			taskInstance.setVariable("date", date);
            taskInstance.setVariable("proname", proname);
            taskInstance.setVariable("uid", uid);
			pInstance.signal();
			jbpmContext.save(pInstance);
			jbpmContext.save(taskInstance);
			
			if(state==1){
				wProcessInstance=pDefinition.createProcessInstance();
				wProcessInstance.signal();
				wTaskInstance=(TaskInstance)wProcessInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
				wTaskInstance.setVariable("proid", processId);
				wTaskInstance.setVariable("state", 11);
				wTaskInstance.setVariable("processid", wProcessInstance.getId());
				wTaskInstance.setVariable("date", date);
				wTaskInstance.setVariable("proname", proname);
				wTaskInstance.setVariable("uid", uid);
				wProcessInstance.signal();
				jbpmContext.save(wProcessInstance);
				jbpmContext.save(wTaskInstance);
			
			}
			
			
			
			
			
			
			jbpmContext.close();
			/*student.setContent(jdaf.getContent());                 
            session.save(student);*/
            session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) {
				session.close();
			}		
		}
			
	}
	
	
	
	

}
