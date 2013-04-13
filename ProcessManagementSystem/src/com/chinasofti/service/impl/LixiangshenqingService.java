package com.chinasofti.service.impl;



import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts.upload.FormFile;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.dao.UserDAO;
import com.chinasofti.domain.Project;
import com.chinasofti.domain.User;
import com.chinasofti.service.IlixiangshenqingService;
import com.chinasofti.service.workflow.action.StartJbpmService;
import com.chinasofti.web.struts.form.LixiangshengqingForm;


public class LixiangshenqingService implements IlixiangshenqingService{

private ProjectDAO projectDAO;
private UserDAO userDAO;
	
	public void save(LixiangshengqingForm form,int uId) {
		
		String projecttype = form.getProjecttype();
		
		int type = Integer.parseInt(projecttype);
        int pid=0;
		/** content property */
		String content = form.getContent();

		/** projectname property */
		String projectname = form.getProjectname();
		Date date=new Date();
		SimpleDateFormat sFormat=new SimpleDateFormat("yyyyMMdd");
		String datestring=sFormat.format(date);
		Project prj = new Project();
		prj.setPname(projectname);
		prj.setFirtype(type);
		prj.setFirgoal(content);
		prj.setFircost(Float.parseFloat(form.getProjectcost()));
		prj.setFirtime(String.valueOf(form.getProjecttime()));
		prj.setUid(uId);
		prj.setFirdate(datestring);
		
		
		
		User user=userDAO.findById(uId);
		String localcompany=user.getPosition();
		String nameString=user.getUname();
		
		prj.setA(nameString);
		prj.setB(localcompany);
		
		
		
		
		
		
		//存储到数据库
		projectDAO.save(prj);
		List instanceList = projectDAO.findByExample(prj);
		int iterator = instanceList.size();
		if (iterator>1) {
			Project[] proArray = (Project[])instanceList.toArray();
			pid = proArray[iterator].getPid();
			for(; iterator>0; iterator--){
				int a = proArray[iterator].getPid();
				if(a>pid)
					pid = a;
			}
		}else if(iterator==1)
			pid = ((Project)instanceList.get(0)).getPid();
		else
			pid = -1;
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
		StartJbpmService startJbpmService=new StartJbpmService();
		startJbpmService.startJbpm(pid,1,simpleDateFormat.format(date),projectname,uId);
		
	
		

	}
	
	
	public ProjectDAO getProjectDAO() {
		return projectDAO;
	}
    

	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
}
