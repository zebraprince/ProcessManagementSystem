package com.chinasofti.service;

import java.util.List;

import com.chinasofti.domain.Project;
import com.chinasofti.web.struts.form.TechForm;
import com.chinasofti.web.struts.form.User1Form;
import com.chinasofti.web.struts.form.UserForm;

public interface ITechProService {

	public abstract List search(TechForm form);
	
	public int[] schForBlock(User1Form form);
	
	public int[] schForCircle(UserForm form);
	
	public List<Project> showProject();

}