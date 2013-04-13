package com.chinasofti.service.workflow.demo.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class RaiseApplicationInfoSaveAction implements ActionHandler{

	public void execute(ExecutionContext arg0) throws Exception {
		//
		System.out.println("RaiseApplicationInfoSaveAction 被执行！");
	}

}
