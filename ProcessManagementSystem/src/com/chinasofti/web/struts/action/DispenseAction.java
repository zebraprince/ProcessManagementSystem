package com.chinasofti.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.service.IDispenseService;
import com.chinasofti.service.workflow.DispenseService;
import com.chinasofti.web.struts.form.JbpmDemoActionForm;

public class DispenseAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		JbpmDemoActionForm jdaf = (JbpmDemoActionForm) form;
		IDispenseService idp = new DispenseService();
		String path = idp.ddispense(jdaf.getUsername());
		//登录的用户名设置到session中
		request.getSession().setAttribute("username", jdaf.getUsername());
		return mapping.findForward(path);
	}

}
