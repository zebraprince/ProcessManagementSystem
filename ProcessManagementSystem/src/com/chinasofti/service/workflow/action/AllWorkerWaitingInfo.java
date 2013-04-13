package com.chinasofti.service.workflow.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class AllWorkerWaitingInfo {

	public List<List<String>> getAllInfo(int uid) {
		List<List<String>> resultList = new ArrayList<List<String>>();

		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();
		TaskMgmtSession tms = jb.getTaskMgmtSession();

		for (int i = 1; i <= 5; i++) {

			String username = "chief" + i;

			ProcessInstance processInstance = null;
			TaskInstance iaInstance = null;
			List<?> list = tms.findTaskInstances(username);
			Iterator<?> iterator = list.iterator();

			while (iterator.hasNext()) {
				List<String> tempList = new ArrayList<String>();
				iaInstance = (TaskInstance) iterator.next();

				processInstance = jb.getProcessInstance(iaInstance.getToken()
						.getId());

				if (processInstance != null && !processInstance.hasEnded()) {
					if ((Integer) iaInstance.getVariable("uid") == uid
							&& (Integer) iaInstance.getVariable("state") < 6) {

						String proid = String.valueOf(iaInstance
								.getVariable("proid"));

						String proname = (String) iaInstance
								.getVariable("proname");
						String date = (String) iaInstance.getVariable("date");
						int state = (Integer) iaInstance.getVariable("state");
						String stateString ="";
						if(state==1)
							stateString="立项审批中";
						
						else if(state==12)
							stateString="实施管理审批中";
							else if(state==14)
								stateString="验收审批中";
							else if(state==16)
								stateString="成果鉴定审批中";
							else if(state==18)
								stateString="奖励审批中";

						tempList.add(proid);
						tempList.add(proname);
						tempList.add(date);     
						tempList.add(stateString);
						

						resultList.add(tempList);

						// request.getSession().setAttribute("content", content);
						// request.getSession().setAttribute("processid", processid);
						// request.getSession().setAttribute("taskid",
						// iaInstance.getId());

					}
				}

			}

		}

		jb.close();

		return resultList;
	}

}
