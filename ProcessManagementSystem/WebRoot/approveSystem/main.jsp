<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>科技项目审批系统</title>
</head>

<frameset rows="61,*,24" cols="*" framespacing="0" frameborder="no" border="0">
  <frame src="approveSystem/top.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" />
  <frame src="approveSystem/center.jsp" name="mainFrame" id="mainFrame" />
  <frame src="approveSystem/down.jsp" name="bottomFrame" scrolling="no" noresize="noresize" id="bottomFrame" />
</frameset>
<noframes><body>
</body>
</noframes></html>
