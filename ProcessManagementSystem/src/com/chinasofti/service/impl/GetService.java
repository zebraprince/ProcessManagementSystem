package com.chinasofti.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chinasofti.service.ITechProService;
import com.chinasofti.service.IUserService;

public class GetService {
	
	public static IUserService getUserService(){
		ApplicationContext cx = new FileSystemXmlApplicationContext("E:/apache-tomcat-6.0.14/webapps/technologyapprove/WEB-INF/applicationContext.xml");
		IUserService serv = (IUserService)cx.getBean("UserService");
		return serv;
	}
	
	public static ITechProService getTechProService(){
		ApplicationContext cx = new FileSystemXmlApplicationContext("E:/apache-tomcat-6.0.14/webapps/technologyapprove/WEB-INF/applicationContext.xml");
		ITechProService serv = (ITechProService)cx.getBean("TechProService");
		return serv;
	}

}
