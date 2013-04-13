package com.chinasofti.service.workflow;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import com.chinasofti.service.ICheckService;

public class CheckService implements ICheckService {

	public void check(String str, String processid, String taskid) {
		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.getCurrentJbpmContext();
		ProcessInstance pInstance = jb.getProcessInstance(Long
				.parseLong(processid));
		TaskInstance taskInstance = jb.getTaskInstance(Long.parseLong(taskid));
		if (str.equals("pass")) {
			// end之后也会向下走一步
			taskInstance.end();
			// pInstance.signal();
		} else {
			taskInstance.end();
			pInstance.end();
		}
	}

}
