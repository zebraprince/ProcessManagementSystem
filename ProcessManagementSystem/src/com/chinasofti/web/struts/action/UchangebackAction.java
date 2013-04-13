/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.chinasofti.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.service.IUserService;
import com.chinasofti.service.impl.GetService;
import com.chinasofti.web.struts.form.UchangeForm;

/** 
 * MyEclipse Struts
 * Creation date: 08-16-2009
 * 
 * XDoclet definition:
 * @struts.action path="/uchangeback" name="uchangeForm" input="/technologymanagementsys/tab/userchange.jsp" scope="request" validate="true"
 * @struts.action-forward name="back" path="/technologymanagementsys/userchange.jsp"
 */
public class UchangebackAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UchangeForm uchangeForm = (UchangeForm) form;// TODO Auto-generated method stub
		
		
		
		return mapping.findForward("back");
		
		
	}
}