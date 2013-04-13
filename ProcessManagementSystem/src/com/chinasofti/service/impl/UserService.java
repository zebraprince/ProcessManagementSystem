package com.chinasofti.service.impl;

import java.util.List;
import java.util.StringTokenizer;

import com.chinasofti.dao.UserDAO;
import com.chinasofti.domain.User;
import com.chinasofti.service.IUserService;
import com.chinasofti.web.struts.form.TmuserForm;
import com.chinasofti.web.struts.form.UchangeForm;

public class UserService implements IUserService {

	private UserDAO userDAO;
	private User user = new User();

	public User getUser() {
		return user;
	}

	public User User(TmuserForm form) {

		if (form.getUsergroup() != null){
			int temp = Integer.parseInt(form.getUsergroup());
			String tempString="";
			if(temp==1)
				tempString = "worker";
			else if(temp==2)
				tempString = "chief1";
			else if(temp==3)
				tempString = "chief2";
			else if(temp==4)
				tempString = "chief3";
			else if(temp==5)
				tempString = "chief4";
			else if(temp==6)
				tempString = "chief5";
			else if(temp==7)
				tempString = "manager";
			else
				tempString = "admin";
			
			user.setDuty(tempString);
		}

		if (form.getUsermodle() != null){
			String temp = form.getUsermodle();
			String tempString="";
			if(temp.equals("1"))
				tempString = "分公司A";
			else if(temp.equals("2"))
				tempString = "分公司B";
			else
				tempString = "分公司C";
			
			user.setDep(tempString);
		}
			
		if (form.getUserclass() != null)
			user.setPosition(form.getUserclass());
		
		if (form.getUseraddress() != null)
			user.setAdr(form.getUseraddress());

		if (form.getUsername() != null) 
			user.setUname(form.getUsername());

		if (form.getUserpwd() != null)
			user.setPassword(form.getUserpwd());

		if (form.getName() != null)
			user.setRealname(form.getName());

		if (form.getUserphone() != null)
			user.setTel(form.getUserphone());
		
		return user;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void Save(User user) {
		userDAO.save(user);

	}

	public void User(String username) {
		// TODO Auto-generated method stub

	}

	public void modify(UchangeForm form) {

		int id = Integer.parseInt(form.getUserID());
		user = userDAO.findById(id);

		if (form.getUsergroup() != null){
			int temp = Integer.parseInt(form.getUsergroup());
			String tempString="";
			if(temp==1)
				tempString = "worker";
			else if(temp==2)
				tempString = "chief1";
			else if(temp==3)
				tempString = "chief2";
			else if(temp==4)
				tempString = "chief3";
			else if(temp==5)
				tempString = "chief4";
			else if(temp==6)
				tempString = "chief5";
			else if(temp==7)
				tempString = "manager";
			else
				tempString = "admin";
			
			user.setDuty(tempString);
		}

		if (form.getUsermodle() != null){
			int temp = Integer.parseInt(form.getUsermodle());
			String tempString="";
			if(temp==1)
				tempString = "分公司A";
			else if(temp==2)
				tempString = "分公司B";
			else
				tempString = "分公司C";
			
			user.setDep(tempString);
		}
			
		user.setPosition(form.getUserclass());
		
		user.setAdr(form.getUseraddress());

		user.setUname(form.getUsername());

		user.setPassword(form.getUserpwd());

		if (form.getName()!=null) 
			user.setRealname(form.getName());

		user.setTel(form.getUserphone());

		userDAO.attachDirty(user);
	}
	
	public void delete(String idStr){
		
		StringTokenizer wanted = new StringTokenizer(idStr, ",");
		int size = wanted.countTokens();
		String[] str = new String[size];
		for(size = size-1; size>=0; size--)
			str[size] = wanted.nextToken();
		int i = str.length;
		int[] id = new int[i];
		
		for(i=i-1; i>=0; i--)
			id[i] = Integer.parseInt(str[i]);
		
		for(int j=str.length-1; j>=0; j--){
			user = userDAO.findById(id[j]);
			userDAO.delete(user);
		}
	}

	public List<User> showUser() {

		List<User> list = userDAO.findAll();

		return list;
	}

}
