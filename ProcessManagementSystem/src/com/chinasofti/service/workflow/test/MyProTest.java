package com.chinasofti.service.workflow.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class MyProTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		JbpmContext jbpmContext = null;
		Session session = null;	
		ProcessInstance pInstance = null;
		TaskInstance taskInstance = null;
		JbpmConfiguration jbpmConfiguration = JbpmConfiguration.getInstance();
		try {
			System.out.println(0);
			jbpmContext = jbpmConfiguration.createJbpmContext();
			System.out.println(1);
			/*session = jbpmContext.getSessionFactory().openSession();
			System.out.println(2);*/
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			System.out.println("hello");
			//查找最新版本流程实例并创建流程实例
			ProcessDefinition pDefinition = jbpmContext.getGraphSession().findLatestProcessDefinition("mypro");
			pInstance = pDefinition.createProcessInstance();
			
			//开启流程也就是让start开始流向下一个节点。
			pInstance.signal();
			taskInstance = (TaskInstance)pInstance.getTaskMgmtInstance().getTaskInstances().iterator().next();
			
            taskInstance.setVariable("content", "hellojbpm");
			taskInstance.setVariable("porcessid", pInstance.getId());
			taskInstance.setVariable("info1",",YJC");
			taskInstance.setVariable("info2","123");
			pInstance.signal();
			jbpmContext.save(pInstance);
			jbpmContext.save(taskInstance);
			jbpmContext.close();
			/*student.setContent(jdaf.getContent());                 
            session.save(student);*/
            session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			System.out.println("OK?");
			if (session!=null) {
				session.close();
			}		
		}
		

	}

}
