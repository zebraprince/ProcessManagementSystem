package com.chinasofti.service.workflow.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class AllChiefTask {

	public List<List<String>> getAll(int state) {
		List<List<String>> resultList = new ArrayList<List<String>>();
		String username = "chief" + state;

		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();
		TaskMgmtSession tms = jb.getTaskMgmtSession();
		ProcessInstance processInstance = null;
		TaskInstance iaInstance = null;
		List<?> list = tms.findTaskInstances(username);
		Iterator<?> iterator = list.iterator();

		// TaskInstance iaInstance =
		// (TaskInstance)tms.findTaskInstances(username).get(0);
		while (iterator.hasNext()) {
			List<String> tempList = new ArrayList<String>();
			iaInstance = (TaskInstance) iterator.next();

			processInstance = jb.getProcessInstance(iaInstance.getToken()
					.getId());

			long processid = processInstance.getId();

			if (processInstance != null && !processInstance.hasEnded()) {
				
				if((Integer)iaInstance.getVariable("state")<6){

				String proid = String.valueOf(iaInstance.getVariable("proid"));
				
				String proname = (String) iaInstance.getVariable("proname");
				String date = (String) iaInstance.getVariable("date");
			

				tempList.add(proid);
				tempList.add(proname);
				tempList.add(date);
				
				resultList.add(tempList);
				}
				// request.getSession().setAttribute("content", content);
				// request.getSession().setAttribute("processid", processid);
				// request.getSession().setAttribute("taskid",
				// iaInstance.getId());

			}

		}

		jb.close();

		return resultList;
	}

}
