package com.chinasofti.service.workflow.handler;

import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.taskmgmt.def.AssignmentHandler;
import org.jbpm.taskmgmt.exe.Assignable;

public class Task4ApplicationAssignment implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void assign(Assignable arg0, ExecutionContext arg1) throws Exception {
		
		
		//把user设置为actor 角色。
		arg0.setActorId("chief3");
	}

}
