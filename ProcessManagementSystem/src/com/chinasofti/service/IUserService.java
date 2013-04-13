package com.chinasofti.service;

import java.util.List;

import com.chinasofti.domain.User;
import com.chinasofti.web.struts.form.TmuserForm;
import com.chinasofti.web.struts.form.UchangeForm;

public interface IUserService {
	
	/**
	 * 
	 * @param username
	 */
	public void User(String username);
	
	public User User(TmuserForm form);
	/**
	 * 
	 * @param processid
	 * @param content
	 * @param taskid
	 */
	public void Save(User user);
	
	public void modify(UchangeForm form);
	
	public void delete(String idStr);
	
	public List<User> showUser();
}
