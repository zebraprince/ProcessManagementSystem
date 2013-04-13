package com.chinasofti.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.domain.Project;

public class DAOtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:/apache-tomcat-6.0.14/webapps/technologyapprove/WEB-INF/applicationContext.xml");
		ProjectDAO lixiangshenpiService=(ProjectDAO)applicationContext.getBean("ProjectDAO");
         Project a =  lixiangshenpiService.findById(4);
          System.out.println(a.getPname());
	}

}
