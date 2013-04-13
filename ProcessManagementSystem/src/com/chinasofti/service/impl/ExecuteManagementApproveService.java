package com.chinasofti.service.impl;


import java.util.Date;
import java.text.SimpleDateFormat;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IExecuteManagementApproveService;

import com.chinasofti.service.workflow.action.SecDoService;

import com.chinasofti.web.struts.form.ExecutionManagementApproveForm;
import com.sun.java_cup.internal.internal_error;

public class ExecuteManagementApproveService implements IExecuteManagementApproveService{
   private ProjectDAO projectDAO;
   public void setProjectDAO(ProjectDAO projectDAO){
	   this.projectDAO=projectDAO;
   }
	public String save(
			ExecutionManagementApproveForm executionManagementApproveForm) {
		// TODO Auto-generated method stub
        System.out.println("接口都爱我记得");
        System.out.println(executionManagementApproveForm.getDecision());
	    SecDoService secDoService=new SecDoService();
	    String pathString=secDoService.firDo(Integer.parseInt(executionManagementApproveForm.getProcessid()), Integer.parseInt(executionManagementApproveForm.getTaskid()),executionManagementApproveForm.getDecision());
	    System.out.println(pathString+"xxxxxxxxxxxxxxxxxxx");
	    if(pathString.equals("finish"))
	    update(executionManagementApproveForm);
	    return pathString;
	    
		
	}
     public void update(ExecutionManagementApproveForm executionManagementApproveForm){
    	 int pid=Integer.parseInt(executionManagementApproveForm.getPid());
  	   Project project=projectDAO.findById(pid);
  	   Date date=new Date();
  	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
  	   String dString=simpleDateFormat.format(date);
  	   String decideString=executionManagementApproveForm.getDecision();
  	   int rank=Integer.parseInt(executionManagementApproveForm.getRank());
  	   if(rank==1){
  	   project.setSecfirId(Integer.parseInt(executionManagementApproveForm.getUid()));
  	   project.setSecfirop(executionManagementApproveForm.getContent());
  	   project.setState(2);
  	   if(decideString.equals("2"))
  		 project.setSecpasdate(dString);
  		   
  	   projectDAO.merge(project);}
  	   else if(rank==2){
  		  project.setSecsecId(Integer.parseInt(executionManagementApproveForm.getUid()));
  	  	   project.setSecsecop(executionManagementApproveForm.getContent());
  	  	project.setState(2);
  	  	if(decideString.equals("2"))
  	  		 project.setSecpasdate(dString);
  	  	   projectDAO.merge(project);} 
  	
     else if(rank==3){
 		  project.setSecthiId(Integer.parseInt(executionManagementApproveForm.getUid()));
 	  	   project.setSechtiop((executionManagementApproveForm.getContent()));
 	  	project.setState(2);
 	  	if(decideString.equals("2"))
 	  		 project.setSecpasdate(dString);
 	  	   projectDAO.merge(project);} 
 	
else if(rank==4){
	  project.setSecfouId(Integer.parseInt(executionManagementApproveForm.getUid()));
  	   project.setSecfouop(executionManagementApproveForm.getContent());
  	 project.setState(2);
  	 if(decideString.equals("2"))
  		 project.setSecpasdate(dString);
  	   projectDAO.merge(project);} 
 
   else if(rank==5){
		  project.setSecfivId(Integer.parseInt(executionManagementApproveForm.getUid()));
	  	   project.setSecfivop(executionManagementApproveForm.getContent());
	  	 project.setState(2);
	  	   project.setSecpasdate(dString);
	  	   projectDAO.merge(project);} 
	   }
    
}
