<%@ page language="java" import="java.util.*,com.chinasofti.service.workflow.action.ManagementInfoService" pageEncoding="utf-8"%>
<%@ page contentType="application/msexcel" %>
<!-- 以上这行设定本网页为excel格式的网页 -->
<%
  response.setHeader("Content-disposition","attachment; filename=test2.xls"); 
  response.setContentType("application/vnd.ms-excel;charset=GBK"); 
   //以上这行设定传送到前端浏览器时的档名为test1.xls
   //就是靠这一行，让前端浏览器以为接收到一个excel档 
%>

<%
	String istr=request.getParameter("i");
	int r = Integer.parseInt(istr);
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String uid = (String) session.getAttribute("uid");
	System.out.println(uid==null);
	System.out.println(uid+"dawdawdwadwadawd");
	int id = Integer.parseInt(uid);
	System.out.println(uid + "ssssssssssssssss");
	//这儿页面载入很卡..................
	ManagementInfoService iw = new ManagementInfoService();
	List<List<String>> list = iw.getInfo(id,r);
	System.out.println(list.size() + "zzzzzzzzzzzzzz");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>

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
	font-size: 14px;
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

.STYLE10 {
	font-size: 18px;
	font-family: "华文楷体";
	color: #2A5F00;
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

		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			

			<tr>
				<td>


						<tr>
							
								<% 
									if (list.size() == 0) {%><%} else { 
								%>
								<table width="89%" border="0" align="center" cellpadding="0"
									cellspacing="1" >
									<tr>
										<td width="7%" height="26" "
											class="STYLE1">
											<div align="center">
												项目id
											</div>
											<div align="center" class="STYLE2 STYLE1"></div>
										</td>
										<td width="45%" height="26" 
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												项目名称
											</div>
										</td>
										<td width="12%" height="26"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												项目提交时间
											</div>
										</td>
										
										
									</tr>
									<%
										for (int i = 0; i < list.size(); i++) {
												List<String> gy = list.get(i);
												String pid = gy.get(0);
												String pname = gy.get(1);
												String ptime = gy.get(2);

												String processid = gy.get(4);
												System.out.println(processid + "bbbbbbbbbbbbbbbbbbbbbbb");
												String taskid = gy.get(5);
									%>
									<tr>
										<td height="18" bgcolor="#FFFFFF" class="STYLE2">
											<div align="center" class="STYLE2 STYLE1"><%=pid%></div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1"><%=pname%></div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1"><%=ptime%></div>
										</td>
										
										
									</tr>

									<%
										}
									%>
								</table>
								<p align="center">
									&nbsp;
								</p>
								
								<p>
									&nbsp;
								</p>
								<p align="center">
									&nbsp;
								</p>
								<p align="center">
									&nbsp;
								</p>
			
							
						</tr>
					</table>
		
	
			
			<%
				}
			%>

	</body>
</html>
