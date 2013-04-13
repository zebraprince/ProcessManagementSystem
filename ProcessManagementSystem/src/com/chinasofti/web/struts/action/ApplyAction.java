package com.chinasofti.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.consts.WorkflowConsts;
import com.chinasofti.service.IApplyService;
import com.chinasofti.service.workflow.ApplyService;
import com.chinasofti.web.struts.form.JbpmDemoActionForm;

public class ApplyAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		IApplyService ias = new ApplyService();
		JbpmDemoActionForm jdaf = (JbpmDemoActionForm)form;
		//
		ias.apply(jdaf.getContent(), WorkflowConsts.WF_TEST_01);	
		return mapping.findForward("success");
	}

}
