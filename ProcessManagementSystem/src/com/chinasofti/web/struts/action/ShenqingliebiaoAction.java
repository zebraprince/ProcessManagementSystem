package com.chinasofti.web.struts.action;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.service.IShenqingliebiaoService;


public class ShenqingliebiaoAction extends Action{
   private ProjectDAO projectDAO;
   private IShenqingliebiaoService shenqingliebiaoService;

public void setProjectDAO(ProjectDAO projectDAO) {
	this.projectDAO = projectDAO;
}

public void setShenqingliebiaoService(
		IShenqingliebiaoService shenqingliebiaoService) {
	this.shenqingliebiaoService = shenqingliebiaoService;
}
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response) {   
	System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
	String uidString=request.getParameter("uid");
	int uid=Integer.parseInt(uidString);
	System.out.println(uid+"''''''''''");
    request.getSession().setAttribute("list", shenqingliebiaoService.getAllInfo(uid));
	
	
	
	return mapping.findForward("success");
}

}
