package com.chinasofti.service.workflow.test;

import java.util.Iterator;
import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class MyProTest_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();

		ProcessInstance pInstance = jb.getProcessInstance(1);
		TaskInstance taskInstance = jb.getTaskInstance(2);
		String str = "pass";
		if (str.equals("pass")) {
			// end之后也会向下走一步
			taskInstance.end();
			// pInstance.signal();
		} else {
			taskInstance.end();
			pInstance.end();
		}
		
		jb.save(pInstance);
		jb.save(taskInstance);
		jb.close();
		
		System.out.println("OK");
		

	}

}
