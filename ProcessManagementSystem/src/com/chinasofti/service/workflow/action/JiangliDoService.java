package com.chinasofti.service.workflow.action;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class JiangliDoService {

	public String managementDo(long procid, long taskid) {

		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();

		ProcessInstance pInstance = jb.getProcessInstance(procid);
		TaskInstance taskInstance = jb.getTaskInstance(taskid);

		taskInstance.setVariable("state", 19);

		taskInstance.end();
		jb.save(pInstance);
		jb.save(taskInstance);
		jb.close();

		return "success";
		
	
	}

}
