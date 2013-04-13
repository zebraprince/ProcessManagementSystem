package com.chinasofti.web.struts.form;

import org.apache.struts.action.ActionForm;

public class JbpmDemoActionForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String username;
    private String password;
    private String content;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
