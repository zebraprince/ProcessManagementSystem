package com.chinasofti.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.service.IShenpiLookupService;
import com.chinasofti.web.struts.form.LookupForm;

public class ShenpiLookupAction extends Action{
   private ProjectDAO projectDAO;
   private IShenpiLookupService shenpiLookupService;
   public void setProjectDAO(ProjectDAO projectDAO){
	   this.projectDAO=projectDAO;
   }
   public void setShenpiLookupService(IShenpiLookupService shenpiLookupService){
	   this.shenpiLookupService=shenpiLookupService;
   }
   public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
	          LookupForm lookupForm=(LookupForm)form;
	           
	           System.out.println("test");
               System.out.println(request.getParameter("pid"));
                System.out.println(lookupForm.getItem()+".................");
            String[] string=shenpiLookupService.lookup(lookupForm);
         request.getSession().setAttribute("info", string);
				return mapping.findForward("success");
	     
	   
	   
   }
}
