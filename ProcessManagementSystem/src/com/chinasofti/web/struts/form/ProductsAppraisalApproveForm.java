/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.chinasofti.web.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 08-18-2009
 * 
 * XDoclet definition:
 * @struts.form name="executionManagementApproveForm"
 */
public class ProductsAppraisalApproveForm extends ActionForm {
	/*
	private String decision;

	/** content property */
	private String decision;
	private String content;
    private String pid;
	private String processid;
	private String taskid;
	private String uid;
	private String rank;
	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the decision.
	 * @return String
	 */
	public String getDecision() {
		return decision;
	}

	/** 
	 * Set the decision.
	 * @param decision The decision to set
	 */
	public void setDecision(String decision) {
		this.decision = decision;
	}

	/** 
	 * Returns the content.
	 * @return String
	 */
	public String getContent() {
		return content;
	}

	/** 
	 * Set the content.
	 * @param content The content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	public String getPid(){
		return pid;
	}
	public void setPid(String pid){
		this.pid=pid;
	}
	
	public String getProcessid(){
		return processid;
	}
	public void setProcessid(String processid){
		this.processid=processid;
	}
	
	public String getTaskid(){
		return taskid;
	}
	public void setTaskid(String taskid){
		this.taskid=taskid;
	}
	public String getUid(){
		return uid;
	}
	public void setUid(String uid){
		this.uid=uid;
	}
    public String getRank(){
    	return rank;
    }
    public void setRank(String rank){
    	this.rank=rank;
    }
}