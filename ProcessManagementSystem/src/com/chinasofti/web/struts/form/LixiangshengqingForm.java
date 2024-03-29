/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.chinasofti.web.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 * MyEclipse Struts Creation date: 08-17-2009
 * 
 * XDoclet definition:
 * 
 * @struts.form name="lixiangshengqingForm"
 */
public class LixiangshengqingForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** projectcost property */
	private String projectcost;

	/** projecttype property */
	private String projecttype;

	/** content property */
	private String content;

	/** projecttime property */
	private String projecttime;

	/** projectname property */
	private String projectname;
	private FormFile formFile=null;

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

	/*	  ActionErrors errors=new ActionErrors();
		  
		  if(formFile==null || formFile.getFileSize()<5 ||
		 formFile.getFileName()==null){ errors.add("file",new ActionError("error.file.null")); }
		  
		  return errors;*/
		return super.validate(mapping, request);
	
		
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the projectcost.
	 * 
	 * @return String
	 */
	public String getProjectcost() {
		return projectcost;
	}

	/**
	 * Set the projectcost.
	 * 
	 * @param projectcost
	 *            The projectcost to set
	 */
	public void setProjectcost(String projectcost) {
		this.projectcost = projectcost;
	}

	/**
	 * Returns the projecttype.
	 * 
	 * @return String
	 */
	public String getProjecttype() {
		return projecttype;
	}

	/**
	 * Set the projecttype.
	 * 
	 * @param projecttype
	 *            The projecttype to set
	 */
	public void setProjecttype(String projecttype) {
		this.projecttype = projecttype;
	}

	/**
	 * Returns the content.
	 * 
	 * @return String
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Set the content.
	 * 
	 * @param content
	 *            The content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Returns the projecttime.
	 * 
	 * @return String
	 */
	public String getProjecttime() {
		return projecttime;
	}

	/**
	 * Set the projecttime.
	 * 
	 * @param projecttime
	 *            The projecttime to set
	 */
	public void setProjecttime(String projecttime) {
		this.projecttime = projecttime;
	}

	/**
	 * Returns the projectname.
	 * 
	 * @return String
	 */
	public String getProjectname() {
		return projectname;
	}

	/**
	 * Set the projectname.
	 * 
	 * @param projectname
	 *            The projectname to set
	 */
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public FormFile getFormFile() {
		return formFile;
	}

	public void setFormFile(FormFile formFile) {
		this.formFile = formFile;
	}

}