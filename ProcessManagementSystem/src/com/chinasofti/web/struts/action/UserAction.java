/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.chinasofti.web.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.service.ITechProService;
import com.chinasofti.service.impl.GetService;
import com.chinasofti.web.struts.form.UserForm;
import com.sun.java_cup.internal.internal_error;
import com.sun.java_cup.internal.runtime.Symbol;

/** 
 * MyEclipse Struts
 * Creation date: 08-14-2009
 * 
 * XDoclet definition:
 * @struts.action path="/user" name="userForm" input="/usersys/ref2left.jsp" scope="request" validate="true"
 * @struts.action-forward name="output" path="/usersys/ref2left.jsp"
 */
public class UserAction extends Action {
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
		UserForm userForm = (UserForm) form;// TODO Auto-generated method stub
		String yearString = userForm.getRefyear();
		String typeString = userForm.getReftype();
		//System.out.println(typeString);
		String typedefine = "";
		if (typeString.equals("0")) {
			typedefine = "项目类型";
		} else if(typeString.equals("1")){
			typedefine = "项目类型1";
		}else if(typeString.equals("2")){
			typedefine = "项目类型2";
		}else if(typeString.equals("3")){
			typedefine = "项目类型3";
		}
		List<String> a= new ArrayList<String>();
		a.add("分公司A");
		a.add("分公司B");
		a.add("分公司C");
		ITechProService tps = GetService.getTechProService();
		int[] wanted = tps.schForCircle(userForm);
		int  q = 0;
		for(int i = wanted.length-1;i>=0;i--){
			q = q + wanted[i];
			
		}
		request.getSession().setAttribute("wanted", wanted);
		request.getSession().setAttribute("typedefine", typedefine);
		request.getSession().setAttribute("comp", a);
		request.getSession().setAttribute("q", String.valueOf(q));
		//System.out.println(typedefine);
		return mapping.findForward("add");
	}
}