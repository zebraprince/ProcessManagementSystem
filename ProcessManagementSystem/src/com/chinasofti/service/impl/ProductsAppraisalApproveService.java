package com.chinasofti.service.impl;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IProductsAppraisalApproveService;
import com.chinasofti.service.workflow.action.FouDoService;
import com.chinasofti.web.struts.form.ProductsAppraisalApproveForm;

public class ProductsAppraisalApproveService implements IProductsAppraisalApproveService{
    private ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public String save(ProductsAppraisalApproveForm productsAppraisalApproveForm) {
		// TODO Auto-generated method stub
		
		FouDoService fouDoService=new FouDoService();
		String pathString=fouDoService.firDo(Integer.parseInt(productsAppraisalApproveForm.getProcessid()), Integer.parseInt(productsAppraisalApproveForm.getTaskid()), productsAppraisalApproveForm.getDecision());
		if(pathString.equals("finish"))
			update(productsAppraisalApproveForm);
		return pathString;
		
	}
   public void update(ProductsAppraisalApproveForm productsAppraisalApproveForm){
	   int pid=Integer.parseInt(productsAppraisalApproveForm.getPid());
  	   Project project=projectDAO.findById(pid);
  	   Date date=new Date();
  	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
  	   String dateString=simpleDateFormat.format(date);
  	   String decideString=productsAppraisalApproveForm.getDecision();
  	   int rank=Integer.parseInt(productsAppraisalApproveForm.getRank());
  	   if(rank==1){
  	   project.setFoufirId((Integer.parseInt(productsAppraisalApproveForm.getUid())));
  	   project.setFoufirop((productsAppraisalApproveForm.getContent()));
  	   project.setState(4);
  	   if(decideString.equals("2"))
  		   project.setFoupasdate(dateString);
  	   projectDAO.merge(project);
  	   }
  	   else  if(rank==2){
  	  	   project.setFousecId((Integer.parseInt(productsAppraisalApproveForm.getUid())));
  	  	   project.setFousecop((productsAppraisalApproveForm.getContent()));
  	  	   project.setState(4);
  	  	   if(decideString.equals("2"))
  	  		   project.setFoupasdate(dateString);
  	  	   projectDAO.merge(project);
  	  	   }
  	 else  if(rank==3){
	  	   project.setFouthiId((Integer.parseInt(productsAppraisalApproveForm.getUid())));
	  	   project.setFouthiop((productsAppraisalApproveForm.getContent()));
	  	   project.setState(4);
	  	   if(decideString.equals("2"))
	  		   project.setFoupasdate(dateString);
	  	   projectDAO.merge(project);
	  	   }
  	else  if(rank==4){
	  	   project.setFoufouId((Integer.parseInt(productsAppraisalApproveForm.getUid())));
	  	   project.setFoufouop((productsAppraisalApproveForm.getContent()));
	  	   project.setState(4);
	  	   if(decideString.equals("2"))
	  		   project.setFoupasdate(dateString);
	  	   projectDAO.merge(project);
	  	   }
  	else  if(rank==5){
	  	   project.setFoufivId((Integer.parseInt(productsAppraisalApproveForm.getUid())));
	  	   project.setFoufivop((productsAppraisalApproveForm.getContent()));
	  	   project.setState(4);
	  	  
	  		   project.setFoupasdate(dateString);
	  	   projectDAO.merge(project);
	  	   }
   }  
}
