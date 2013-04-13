package com.chinasofti.service.workflow.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import com.chinasofti.service.workflow.IFirInfoService;

public class FirInfoService implements IFirInfoService {
//从jbpm数据库获得的表信息........因此可以直接调用
	public List<List<String>> getFirInfo(int item,int state) {
		// TODO Auto-generated method stub
		
		
		String username = "chief"+item;
		
		JbpmConfiguration jc = JbpmConfiguration.getInstance();
		JbpmContext jb = jc.createJbpmContext();
		TaskMgmtSession tms = jb.getTaskMgmtSession();
		ProcessInstance processInstance = null;
		TaskInstance iaInstance = null;
		List<?> list = tms.findTaskInstances(username);
		Iterator<?> iterator = list.iterator();
		List<List<String>> resultList = new ArrayList<List<String>>();
		
		
		
		
		// TaskInstance iaInstance =
		// (TaskInstance)tms.findTaskInstances(username).get(0);
		while (iterator.hasNext()) {
			List<String> tempList=new ArrayList<String>();
		    iaInstance = (TaskInstance) iterator.next();

			processInstance = jb.getProcessInstance(iaInstance.getToken()
					.getId());

            
            
			
			long processid = processInstance.getId();
		

			if (processInstance != null && !processInstance.hasEnded()) {
				 
			if((Integer)iaInstance.getVariable("state")==state){
				
					String proid = String.valueOf(iaInstance.getVariable("proid")) ;
			        String procid = Long.toString(processid);
			        String taskid = Long.toString(iaInstance.getId());
			        String uid=String.valueOf(iaInstance.getVariable("uid"));
			        String proname = (String)iaInstance.getVariable("proname");
			        String date = (String)iaInstance.getVariable("date");
			        
			        tempList.add(proid);
			        tempList.add(proname);
			        tempList.add(date);
			        tempList.add(uid);
			        tempList.add(procid);
			        tempList.add(taskid);
			        
			        
			       
			        
			        System.out.println("2222555555");
			        
			        resultList.add(tempList);
	
				// request.getSession().setAttribute("content", content);
				// request.getSession().setAttribute("processid", processid);
				// request.getSession().setAttribute("taskid",
				// iaInstance.getId());
			}}

		}
		
		jb.close();
		

		
		

		
		return resultList;
	}

	
	
	
	
	
}
