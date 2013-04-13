package com.chinasofti.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.service.IBonusApplicationService;
import com.chinasofti.service.workflow.action.JiangliDoService;
import com.chinasofti.service.workflow.action.StartJbpmService;
import com.chinasofti.web.struts.form.BonusApplicationForm;



public class BonusApplicationService implements IBonusApplicationService{
    private ProjectDAO projectDAO;
    public void setProjectDAO(ProjectDAO projectDAO){
    	this.projectDAO=projectDAO;
    }
	public void save(BonusApplicationForm bonusApplicationForm) {
	StartJbpmService startJbpmService=new StartJbpmService();
	JiangliDoService jiangliDoService=new JiangliDoService();
	jiangliDoService.managementDo(Long.parseLong(bonusApplicationForm.getProcessid()), Long.parseLong(bonusApplicationForm.getTaskid()));
	Date date=new Date();
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
	System.out.println("pppppppppppp");
	startJbpmService.startJbpm(Integer.parseInt(bonusApplicationForm.getPid()), 5, simpleDateFormat.format(date), bonusApplicationForm.getPname(), Integer.parseInt(bonusApplicationForm.getUid()));
	update(bonusApplicationForm);
		
	}
    public void update(BonusApplicationForm bonusApplicationForm){
    	  int pid=Integer.parseInt(bonusApplicationForm.getPid());
   	   Project project=projectDAO.findById(pid);
   	   Date date=new Date();
   	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
   	   project.setFivedate(simpleDateFormat.format(date));
   	   projectDAO.merge(project);
   	   
    }
}
