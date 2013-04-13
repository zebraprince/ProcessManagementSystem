package com.chinasofti.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.ITestApplicationService;
import com.chinasofti.service.workflow.action.StartJbpmService;

import com.chinasofti.service.workflow.action.YanshouDoService;
import com.chinasofti.web.struts.form.TestApplicationForm;



public class TestApplicationService implements ITestApplicationService{
    private ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public void save(TestApplicationForm testApplicationForm) {
		StartJbpmService startJbpmService=new StartJbpmService();
		YanshouDoService yanshouDoService=new YanshouDoService();
		yanshouDoService.managementDo(Long.parseLong(testApplicationForm.getProcessid()),Long.parseLong(testApplicationForm.getTaskid()));
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM日dd日");
		startJbpmService.startJbpm(Integer.parseInt(testApplicationForm.getPid()),3,simpleDateFormat.format(date),testApplicationForm.getPname(),Integer.parseInt(testApplicationForm.getUid()));
		update(testApplicationForm);
	}
   public void update(TestApplicationForm testApplicationForm){
	   int pid=Integer.parseInt(testApplicationForm.getPid());
	   Project project=projectDAO.findById(pid);
	   Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
		project.setThidate(simpleDateFormat.format(date));
		projectDAO.merge(project);
	   
	   
   }
}
