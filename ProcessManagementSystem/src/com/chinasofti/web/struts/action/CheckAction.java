package com.chinasofti.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.service.ICheckService;
import com.chinasofti.service.workflow.CheckService;

public class CheckAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
   	    String path = null;
		String taskid = request.getParameter("taskid");
		String processid = request.getParameter("processid");
		String str = request.getParameter("button");

		ICheckService ics = new CheckService();
		ics.check(str, processid, taskid);
		return mapping.findForward(path);
	}

}
