package com.chinasofti.service.impl;



import java.util.Date;
import java.text.SimpleDateFormat;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IExecuteManagementApplicationService;

import com.chinasofti.service.workflow.action.ManagementDoService;
import com.chinasofti.service.workflow.action.StartJbpmService;

import com.chinasofti.web.struts.form.ExecutionManagementApplicationForm;




public class ExecuteManagementApplicationService implements IExecuteManagementApplicationService{
   private ProjectDAO projectDAO;
   public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}
   //保存到jbpm流
	public void save(
	    ExecutionManagementApplicationForm executionManagementApplicationForm) {
		
	   
	    StartJbpmService startJbpmService=new StartJbpmService();
	    Date date=new Date();
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
	    ManagementDoService managementDoService=new ManagementDoService();
	    managementDoService.managementDo(Long.parseLong(executionManagementApplicationForm.getProcessid()), Long.parseLong(executionManagementApplicationForm.getTaskid()));
	    System.out.println("mddddddddddddddddddddddddd");
	    startJbpmService.startJbpm(Integer.parseInt(executionManagementApplicationForm.getPid()),2,simpleDateFormat.format(date),executionManagementApplicationForm.getPname(),Integer.parseInt(executionManagementApplicationForm.getUid()));
	    update(executionManagementApplicationForm);
	    
	    
	}
	//更新数据库
   public void update(ExecutionManagementApplicationForm executionManagementApplicationForm){
	   int pid=Integer.parseInt(executionManagementApplicationForm.getPid());
	   Project project=projectDAO.findById(pid);
	   Date date=new Date();
	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
	   //申请时间
	   project.setSecdate(simpleDateFormat.format(date));
	  project.setSuffer(executionManagementApplicationForm.getAssumeCompany());
	  project.setCoo(executionManagementApplicationForm.getCooperationCompany());
	  project.setStartdate(executionManagementApplicationForm.getContractStartTime());
	  project.setEnddate(executionManagementApplicationForm.getContractFinishTime());
	  project.setPersonA(executionManagementApplicationForm.getPrincipalA());
	  project.setPersonB(executionManagementApplicationForm.getPrincipalB());
	  project.setProinvest(Float.parseFloat(executionManagementApplicationForm.getProjectInvestment()));
	  project.setCostrep(Float.parseFloat(executionManagementApplicationForm.getPaymentSituation()));
	  project.setProrep(Integer.parseInt(executionManagementApplicationForm.getProjectSchedule()));
	  projectDAO.merge(project);
   }

}
