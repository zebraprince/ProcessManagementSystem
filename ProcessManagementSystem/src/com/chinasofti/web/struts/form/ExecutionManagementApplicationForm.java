/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.chinasofti.web.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/** 
 * MyEclipse Struts
 * Creation date: 08-18-2009
 * 
 * XDoclet definition:
 * @struts.form name="executionManagementApplicationForm"
 */
public class ExecutionManagementApplicationForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** contractStartTime property */
	private String contractStartTime;

	/** contractFinishTime property */
	private String contractFinishTime;

	/** assumeCompany property */
	private String assumeCompany;

	/** projectSchedule property */
	private String projectSchedule;

	/** principalB property */
	private String principalB;


	/** cooperationCompany property */
	private String cooperationCompany;

	/** projectInvestment property */
	private String projectInvestment;

	
	/** principalA property */
	private String principalA;
    private FormFile formFile;
	/** paymentSituation property */
	private String paymentSituation;
   private String processid;
   private String taskid;
   private String pid;
   private String pname;
   private String uid;
   
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
	 * Returns the contractStartTime.
	 * @return String
	 */
	public String getContractStartTime() {
		return contractStartTime;
	}

	/** 
	 * Set the contractStartTime.
	 * @param contractStartTime The contractStartTime to set
	 */
	public void setContractStartTime(String contractStartTime) {
		this.contractStartTime = contractStartTime;
	}

	/** 
	 * Returns the contractFinishTime.
	 * @return String
	 */
	public String getContractFinishTime() {
		return contractFinishTime;
	}

	/** 
	 * Set the contractFinishTime.
	 * @param contractFinishTime The contractFinishTime to set
	 */
	public void setContractFinishTime(String contractFinishTime) {
		this.contractFinishTime = contractFinishTime;
	}

	/** 
	 * Returns the assumeCompany.
	 * @return String
	 */
	public String getAssumeCompany() {
		return assumeCompany;
	}

	/** 
	 * Set the assumeCompany.
	 * @param assumeCompany The assumeCompany to set
	 */
	public void setAssumeCompany(String assumeCompany) {
		this.assumeCompany = assumeCompany;
	}

	/** 
	 * Returns the projectSchedule.
	 * @return String
	 */
	public String getProjectSchedule() {
		return projectSchedule;
	}

	/** 
	 * Set the projectSchedule.
	 * @param projectSchedule The projectSchedule to set
	 */
	public void setProjectSchedule(String projectSchedule) {
		this.projectSchedule = projectSchedule;
	}

	/** 
	 * Returns the principalB.
	 * @return String
	 */
	public String getPrincipalB() {
		return principalB;
	}

	/** 
	 * Set the principalB.
	 * @param principalB The principalB to set
	 */
	public void setPrincipalB(String principalB) {
		this.principalB = principalB;
	}



	/** 
	 * Returns the cooperationCompany.
	 * @return String
	 */
	public String getCooperationCompany() {
		return cooperationCompany;
	}

	/** 
	 * Set the cooperationCompany.
	 * @param cooperationCompany The cooperationCompany to set
	 */
	public void setCooperationCompany(String cooperationCompany) {
		this.cooperationCompany = cooperationCompany;
	}

	/** 
	 * Returns the projectInvestment.
	 * @return String
	 */
	public String getProjectInvestment() {
		return projectInvestment;
	}

	/** 
	 * Set the projectInvestment.
	 * @param projectInvestment The projectInvestment to set
	 */
	public void setProjectInvestment(String projectInvestment) {
		this.projectInvestment = projectInvestment;
	}

	/** 
	 * Returns the projectName.
	 * @return String
	 */
	

	/** 
	 * Returns the principalA.
	 * @return String
	 */
	public String getPrincipalA() {
		return principalA;
	}

	/** 
	 * Set the principalA.
	 * @param principalA The principalA to set
	 */
	public void setPrincipalA(String principalA) {
		this.principalA = principalA;
	}

	/** 
	 * Returns the paymentSituation.
	 * @return String
	 */
	public String getPaymentSituation() {
		return paymentSituation;
	}

	/** 
	 * Set the paymentSituation.
	 * @param paymentSituation The paymentSituation to set
	 */
	public void setPaymentSituation(String paymentSituation) {
		this.paymentSituation = paymentSituation;
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
	public String getPid(){
		return pid;
	}
	public void setPid(String pid){
		this.pid=pid;
	}
	public String getPname(){
		return pname;
	}
	public void setPname(String pname){
		this.pname=pname;
	}
	public String getUid(){
		return uid;
	}
	public void setUid(String uid){
		this.uid=uid;
	}

	public FormFile getFormFile() {
		return formFile;
	}

	public void setFormFile(FormFile formFile) {
		this.formFile = formFile;
	}
}