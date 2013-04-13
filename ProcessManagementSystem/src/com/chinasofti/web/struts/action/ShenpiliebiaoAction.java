package com.chinasofti.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.service.IShenpiliebiaoService;
import com.chinasofti.web.struts.form.ShenpiliebiaoForm;
import com.sun.java_cup.internal.internal_error;


public class ShenpiliebiaoAction  extends Action{
  private ProjectDAO projectDAO;
  private IShenpiliebiaoService shenpiliebiaoService;

public void setProjectDAO(ProjectDAO projectDAO) {
	this.projectDAO = projectDAO;
}

public void setShenpiliebiaoService(IShenpiliebiaoService shenpiliebiaoService) {
	this.shenpiliebiaoService = shenpiliebiaoService;
}
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response){
	   //ShenpiliebiaoForm shenpiliebiaoForm=(ShenpiliebiaoForm)form;
	   String uid=request.getParameter("uid");
	   String state=request.getParameter("state");
	   int id=Integer.parseInt(uid);
	   int s=Integer.parseInt(state);
	   request.getSession().setAttribute("list", shenpiliebiaoService.getInfo(id, s));
	   return mapping.findForward("success");
}
}
