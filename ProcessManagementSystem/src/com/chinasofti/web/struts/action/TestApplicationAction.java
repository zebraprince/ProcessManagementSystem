/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.chinasofti.web.struts.action;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.chinasofti.dao.ProjectDAO;
import com.chinasofti.service.ITestApplicationService;
import com.chinasofti.service.impl.ValidateFormFile;
import com.chinasofti.web.struts.form.TestApplicationForm;

/** 
 * MyEclipse Struts
 * Creation date: 08-18-2009
 * 
 * XDoclet definition:
 * @struts.action path="/testApplication" name="testApplicationForm" input="/form/testApplication.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/applicationSystem/submissionSuccess.jsp"
 */
public class TestApplicationAction extends Action {
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
	private ProjectDAO projectDAO;
	private ITestApplicationService testApplicationService;
	public void setProjectDAO(ProjectDAO projectDAO){
		this.projectDAO=projectDAO;
	}
	public void setTestApplicationService(ITestApplicationService testApplicationService){
		this.testApplicationService=testApplicationService;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		TestApplicationForm testApplicationForm = (TestApplicationForm) form;// TODO Auto-generated method stub
		 String pname=testApplicationForm.getPname();
			
			
			
//			ActionErrors errors=new ActionErrors();  
			
			FormFile file=testApplicationForm.getFormFile();
			//先生成一个以项目名命名的文件夹
			
			File  l=new File("E:\\workspace\\"+pname+"\\验收阶段");
			l.mkdirs();
			String filePath = l.getAbsolutePath();
			System.out.println(file.getFileName());
			if(file!=null&&!file.getFileName().trim().equals("")){
			
				ValidateFormFile vff=new ValidateFormFile();
			    if(!vff.validateName(file)){
			    	System.out.println("我们是祖国的花朵!");
			    	 response.setCharacterEncoding("gbk");   
			            response.getWriter().write("出错啦！你上传的文件必须是'.doc'、'.docx'、'pdf'、'txt'、'rar'！");
			            return null;
			    	
			    }
			    else if(!vff.validateSize(file)){
			    	 response.setCharacterEncoding("gbk");   
			            response.getWriter().write("出错啦！你上传的文件不能超过5MB！");   
			            return null;

			    }
			    else{
			    	  
					  try {

							InputStream iStream = file.getInputStream();
							

							ByteArrayOutputStream baos = new ByteArrayOutputStream();
							OutputStream os = new FileOutputStream(filePath + "/" + file.getFileName() );
							
							int bytesRead = 0;
							byte[] buffer = new byte[8192];
							while (((bytesRead = iStream.read(buffer,0,8192)) != -1)) {
								os.write(buffer, 0, bytesRead);
							}
							baos.close();
							iStream.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
			    }
			  }  
			  
		testApplicationService.save(testApplicationForm);
		return mapping.findForward("success");
	}
}