package com.chinasofti.service.impl;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.ITestApproveService;
import com.chinasofti.service.workflow.action.ThiDoService;
import com.chinasofti.web.struts.form.TestApproveForm;
import com.sun.java_cup.internal.internal_error;

public class TestApproveService implements ITestApproveService{
    ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public String save(TestApproveForm testApproveForm) {
		ThiDoService thiDoService=new ThiDoService();
		String pathString=thiDoService.firDo(Integer.parseInt(testApproveForm.getProcessid()), Integer.parseInt(testApproveForm.getTaskid()), testApproveForm.getDecision());
		if(pathString.equals("finish"))
		update(testApproveForm);
		
		return pathString;
	}
   public void update(TestApproveForm testApproveForm){
	   int pid=Integer.parseInt(testApproveForm.getPid());
  	   Project project=projectDAO.findById(pid);
  	   int rank=Integer.parseInt(testApproveForm.getRank());
  	   String decideString=testApproveForm.getDecision();
  	   Date date=new Date();
  	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
  	   String dateString=simpleDateFormat.format(date); 
  	   if(rank==1){
  	   project.setThifirId((Integer.parseInt(testApproveForm.getUid())));
  	   project.setThifirop((testApproveForm.getContent()));
  	 project.setState(3);
  	   if(decideString.equals("2"))
  		  project.setThipasdate(dateString);
  	   projectDAO.merge(project);}
  	   else  if(rank==2){
  	  	   project.setThisecId((Integer.parseInt(testApproveForm.getUid())));
  	  	   project.setThisecop((testApproveForm.getContent()));
  	  	   project.setState(3);
  	  	   if(decideString.equals("2"))
  	  		  project.setThipasdate(dateString);
  	  	   projectDAO.merge(project);}
  	 else  if(rank==3){
	  	   project.setThithiId((Integer.parseInt(testApproveForm.getUid())));
	  	   project.setThithiop((testApproveForm.getContent()));
	  	 project.setState(3);
	  	   if(decideString.equals("2"))
	  		  project.setThipasdate(dateString);
	  	   projectDAO.merge(project);}
  	 else  if(rank==4){
	  	   project.setThifouId((Integer.parseInt(testApproveForm.getUid())));
	  	   project.setThifouop((testApproveForm.getContent()));
	  	 project.setState(3);
	  	   if(decideString.equals("2"))
	  		  project.setThipasdate(dateString);
	  	   projectDAO.merge(project);}
  	 else  if(rank==5){
	  	   project.setThifivId((Integer.parseInt(testApproveForm.getUid())));
	  	   project.setThifivop((testApproveForm.getContent()));
	  	 project.setState(3);
	  	 
	  		  project.setThipasdate(dateString);
	  	   projectDAO.merge(project);}
  	      
   }
}
