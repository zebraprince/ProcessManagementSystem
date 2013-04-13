package com.chinasofti.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IBonusApproveService;
import com.chinasofti.service.workflow.action.FivDoService;
import com.chinasofti.web.struts.form.BonusApproveForm;

public class BonusApproveService implements IBonusApproveService{
	private ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public String save(BonusApproveForm bonusApproveForm) {
		// TODO Auto-generated method stub
		FivDoService fivDoService=new FivDoService();
		System.out.println(bonusApproveForm.getDecision()+"aaaaaaaaaaaaaaaaaaa");
		String pathString=fivDoService.firDo(Integer.parseInt(bonusApproveForm.getProcessid()), Integer.parseInt(bonusApproveForm.getTaskid()), bonusApproveForm.getDecision());
		if(pathString.equals("finish"))
		update(bonusApproveForm);
		return pathString;
	}
   public void update(BonusApproveForm bonusApproveForm){
	   int pid=Integer.parseInt(bonusApproveForm.getPid());
  	   Project project=projectDAO.findById(pid);
  	 Date date=new Date();
	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
	   String dateString=simpleDateFormat.format(date);
	   String decideString=bonusApproveForm.getDecision();
	   int rank=Integer.parseInt(bonusApproveForm.getRank());
	   if(rank==1){
  	   project.setFivfirId((Integer.parseInt(bonusApproveForm.getUid())));
  	   project.setFivfirop((bonusApproveForm.getContent()));
  	   project.setState(5);
  	   if(decideString.equals("2"))
  		   project.setFivpasdate(dateString);
  	   projectDAO.merge(project);
	   }
	   else   if(rank==2){
	  	   project.setFivsecId((Integer.parseInt(bonusApproveForm.getUid())));
	  	   project.setFivsecop((bonusApproveForm.getContent()));
	  	   project.setState(5);
	  	   if(decideString.equals("2"))
	  		   project.setFivpasdate(dateString);
	  	   projectDAO.merge(project);
		   }
	   else   if(rank==3){
	  	   project.setFivthiId((Integer.parseInt(bonusApproveForm.getUid())));
	  	   project.setFivthiop((bonusApproveForm.getContent()));
	  	   project.setState(5);
	  	   if(decideString.equals("2"))
	  		   project.setFivpasdate(dateString);
	  	   projectDAO.merge(project);
		   }
	   else   if(rank==4){
	  	   project.setFivfouId((Integer.parseInt(bonusApproveForm.getUid())));
	  	   project.setFivfouop((bonusApproveForm.getContent()));
	  	   project.setState(5);
	  	   if(decideString.equals("2"))
	  		   project.setFivpasdate(dateString);
	  	   projectDAO.merge(project);
		   }
	   else   if(rank==5){
	  	   project.setFivfivId((Integer.parseInt(bonusApproveForm.getUid())));
	  	   project.setFivfivop((bonusApproveForm.getContent()));
	  	   project.setState(5);
	  	 
	  		   project.setFivpasdate(dateString);
	  	   projectDAO.merge(project);
		   }
   }
}
