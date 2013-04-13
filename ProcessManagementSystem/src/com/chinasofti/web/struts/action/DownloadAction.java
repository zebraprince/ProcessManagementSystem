package com.chinasofti.web.struts.action;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DownloadAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String path = null;
		String filePath = "E:\\apache-tomcat-6.0.14\\webapps\\technologyapprove\\upload\\";
		String fileName = request.getParameter("fileName");
		File file = new File(filePath + fileName);
		System.out.println(file);
		if(!file.exists()){ 
			path = "error";
			}else{ 
			FileInputStream fis = new FileInputStream(file); 
			BufferedInputStream bis = new BufferedInputStream(fis); 

			OutputStream os=response.getOutputStream(); 
			BufferedOutputStream bos=new BufferedOutputStream(os); 

			fileName=URLEncoder.encode(fileName,"UTF-8"); 
			fileName=new String(fileName.getBytes("UTF-8"),"GBK"); 

			response.reset();
			response.setContentType("UTF-8"); 
			response.setContentType("Application/x-msdownload"); 
			response.setHeader("Content-Disposition", "attachment;filename="+fileName); 
			response.setHeader("Content-Length", String.valueOf(bis.available())); 

			int bytesRead=0; 
			byte[] buffer=new byte[1024]; 
			while((bytesRead=bis.read(buffer))!=-1){ 
			bos.write(buffer,0,bytesRead); 
			} 
			bos.flush(); 
			bos.close(); 
			bis.close(); 
			os.close(); 
			fis.close(); 
			}
		return mapping.findForward(path);
	}

}
