<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.chinasofti.domain.Project"%>
<%@ page contentType="application/msexcel" %>
<!-- 以上这行设定本网页为excel格式的网页 -->
<%
  response.setHeader("Content-disposition","attachment; filename=test2.xls"); 
  response.setContentType("application/vnd.ms-excel;charset=GBK"); 
   //以上这行设定传送到前端浏览器时的档名为test1.xls
   //就是靠这一行，让前端浏览器以为接收到一个excel档 
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


List list = new ArrayList();
list = (List<Project>)session.getAttribute("list");

	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>无标题文档</title>
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.STYLE1 {
	font-size: 12px
}

.STYLE4 {
	font-size: 12px;
	color: #1F4A65;
	font-weight: bold;
}

a:link {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}

a:visited {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}

a:hover {
	font-size: 12px;
	color: #FF0000;
	text-decoration: underline;
}

a:active {
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}

.STYLE7 {
	font-size: 12
}
-->
</style>

		<script>
var  highlightcolor='#eafcd5';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
	</head>

	<body>
		
					
								<table width="99%" border="0" align="center" cellpadding="0"
									cellspacing="1"  >
									<tr>

										<td width="7%" height="18""
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1"> 
												项目ID 
											</div>
										</td>
										<td width="15%" height="18" 
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												立项申请人名称
											</div>
										</td>
										<td width="7%" height="18" 
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												项目类别
											</div>
										</td>
										<td width="10%" height="18" 
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												经费(万元)
											</div>
										</td>
										<td width="17%"class="STYLE1">
											<div align="center" class="STYLE2">
												立项申请日期
											</div>
										</td>
										<td width="12%" height="18" 
											class="STYLE1">
											<div align="center" class="STYLE2">
												状态
											</div>
										</td>
										


									</tr>
									<%if(list.size()!=0){
										for (int i = list.size()-1; i >= 0; i--) {
											Project pro = (Project)list.get(i);
											String id = pro.getPid()+"";
											String name = pro.getA();
											String type = pro.getFirtype()+"";
											String cost = pro.getFircost()+"";
											String date = pro.getFirdate();
											String state = pro.getState()+"";
											//System.out.println("asdjkfhkjdbgwer" + id);
																						
										
										
									%>

									<tr>

										<td height="18" bgcolor="#FFFFFF" class="STYLE2">
											<div align="center" class="STYLE2 STYLE1">
												<%= id%>
											</div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1">
												<%= name%>
											</div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1">
												<%= type%>
											</div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1">
												<%= cost%>
											</div>
										</td>
										<td bgcolor="#FFFFFF">
											<div align="center">
												<%= date%>
											</div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center">
											<%= state%>
											</div>
										</td>
										


									</tr>

									<%
										}}
									%>
								</table>
								
						
			  
	</body>
</html>

