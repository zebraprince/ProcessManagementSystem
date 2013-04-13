package com.chinasofti.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;

import com.chinasofti.service.ILixiangshenpiService;

import com.chinasofti.service.workflow.IFirDoService;
import com.chinasofti.service.workflow.action.FirDoService;

import com.chinasofti.web.struts.form.LixiangshenpiForm;




public class LixiangshenpiService implements ILixiangshenpiService{
 
private ProjectDAO projectDAO;
  public ProjectDAO getProjectDAO(){
	  return projectDAO;
  }
	public void setProjectDAO(ProjectDAO projectDAO){
		this.projectDAO=projectDAO;
	}
	
	


	public String  save(LixiangshenpiForm form) {
		
		IFirDoService firDoService=new FirDoService();
		System.out.println(form.getProcessid());
		System.out.println(form.getPid()+"lllllllllllllll");
		int proid=Integer.parseInt(form.getProcessid());
		int taskid=Integer.parseInt(form.getTaskid());
		
		String decide=form.getDecision();
		String pathString=firDoService.firDo(proid,taskid ,decide );
		if(pathString.equals("finish")){
		update(form);
		}
		return pathString;
	}
	
public void update(LixiangshenpiForm form){
		
		int state =0;
		int pid=Integer.parseInt(form.getPid());
		int uid=Integer.parseInt(form.getUid());
	    int rank=Integer.parseInt(form.getRank());
	   
	   Date date=new Date();
	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
	   String timeString=simpleDateFormat.format(date);
		String opi=form.getContent();
		String decide=form.getDecision();
		
		
		
		Project pro = new Project();
         pro =  projectDAO.findById(pid);
	    System.out.println(opi+"cccccccccccc");
	    if(rank==1){
		pro.setFirfirop(opi);
		pro.setFirfirId(uid);
		
//		pro.setFirdate(timeString);
		if(decide.equals("1"))
		   pro.setFirpasdate(timeString);
		pro.setState(1);
		
		
		projectDAO.merge(pro);
			
      }
	    else if(rank==2){
	    	pro.setFirsecop(opi);
			pro.setFirsecId(uid);
			
			if(decide.equals("1"))
				   pro.setFirpasdate(timeString);
			pro.setState(1);
			
			projectDAO.merge(pro);
	    }else if(rank==3){
	    	pro.setFirthiop(opi);
			pro.setFirthiId(uid);
			if(decide.equals("1"))
				   pro.setFirpasdate(timeString);
			pro.setState(1);
			
			projectDAO.merge(pro);
	    }
	    else if(rank==4){
	    	pro.setFirfouop(opi);
			pro.setFirfouId(uid);
			if(decide.equals("1"))
				   pro.setFirpasdate(timeString);
			pro.setState(1);
			
			projectDAO.merge(pro);
	    }
	    else if(rank==5){
	    	pro.setFirfivop(opi);
			pro.setFirfivId(uid);
			pro.setFirpasdate(timeString);
			if(decide.equals("1"))
				state = 2;
			else
				state =7;
			pro.setState(1);
			
			projectDAO.merge(pro);
	    }
	}
	
 
}
