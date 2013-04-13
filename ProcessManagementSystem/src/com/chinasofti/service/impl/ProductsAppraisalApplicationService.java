package com.chinasofti.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IProductsAppraisalApplicationService;
import com.chinasofti.service.workflow.action.ChengguoDoService;
import com.chinasofti.service.workflow.action.StartJbpmService;

import com.chinasofti.web.struts.form.ProductsAppraisalApplicationForm;

public class ProductsAppraisalApplicationService implements IProductsAppraisalApplicationService{
    ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public void save(
			ProductsAppraisalApplicationForm productsAppraisalApplicationForm) {
		// TODO Auto-generated method stub
		StartJbpmService startJbpmService=new StartJbpmService();
		ChengguoDoService chengguoDoService=new ChengguoDoService();
		chengguoDoService.managementDo(Long.parseLong(productsAppraisalApplicationForm.getProcessid()),Long.parseLong(productsAppraisalApplicationForm.getTaskid()));
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM日dd日");
		System.out.println(productsAppraisalApplicationForm.getPid()+"mmmmmmmmmmmmmmmmmm");
		System.out.println(productsAppraisalApplicationForm.getUid()+"mmmmmmmmmmmmmmmmmmm");
		startJbpmService.startJbpm(Integer.parseInt(productsAppraisalApplicationForm.getPid()),4,simpleDateFormat.format(date),productsAppraisalApplicationForm.getPname(),Integer.parseInt(productsAppraisalApplicationForm.getUid()));
		update(productsAppraisalApplicationForm);
	}
    public void update(ProductsAppraisalApplicationForm productsAppraisalApplicationForm){
    	 int pid=Integer.parseInt(productsAppraisalApplicationForm.getPid());
  	   Project project=projectDAO.findById(pid);
  	   Date date=new Date();
  	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
  	   project.setFoudate(simpleDateFormat.format(date));
  	 projectDAO.merge(project);
  	   
    }
}
