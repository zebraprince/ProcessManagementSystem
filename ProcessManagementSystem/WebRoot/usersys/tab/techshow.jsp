<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.chinasofti.domain.Project"%>

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
		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="30">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="15" height="30">
								<img src="images/tab_03.gif" width="15" height="30" />
							</td>
							<td width="1101" background="images/tab_05.gif">
								<img src="images/311.gif" width="16" height="16" />
								<span class="STYLE4">项目列表 </span>
							</td>
							<td width="281" background="images/tab_05.gif">
								<table border="0" align="right" cellpadding="0" cellspacing="0">
									<tr>
										<td width="19">
											&nbsp;
										</td>
										<td width="30">
											&nbsp;
										</td>
										<td width="100">
											<table width="90%" border="0" cellpadding="0" cellspacing="0">
												<tr>
													<td class="STYLE1">
														<div align="center">
															<img src="images/037.gif" width="10" height="10" />
														</div>
													</td>
													<td class="STYLE1">
														<div align="center">
															<a href="/technologyapprove/usersys/tab/techcl.jsp" target = "_blank">导出EXCEL</a>
														</div>
													</td>
												</tr>
											</table>
										</td>

										<td width="52">
											<table width="88%" border="0" cellpadding="0" cellspacing="0">
												<tr>
													<td class="STYLE1">
														<div align="center">
															<img src="images/083.gif" width="14" height="14" />
														</div>
													</td>
													<td class="STYLE1">
														<div align="center">
															<a href="tab.jsp" target="I1">退出</a>
														</div>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
							<td width="14">
								<img src="images/tab_07.gif" width="14" height="30" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="9" background="images/tab_12.gif">
								&nbsp;
							</td>
							<td bgcolor="#f3ffe3">
								<table width="99%" border="0" align="center" cellpadding="0"
									cellspacing="1" bgcolor="#c0de98" onmouseover="changeto()"
									onmouseout="changeback()">
									<tr>

										<td width="7%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1"> 
												项目ID 
											</div>
										</td>
										<td width="15%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												立项申请人名称
											</div>
										</td>
										<td width="7%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												项目类别
											</div>
										</td>
										<td width="10%" height="18" background="images/tab_14.gif"
											class="STYLE1">
											<div align="center" class="STYLE2 STYLE1">
												经费(万元)
											</div>
										</td>
										<td width="17%" background="images/tab_14.gif" class="STYLE1">
											<div align="center" class="STYLE2">
												立项申请日期
											</div>
										</td>
										<td width="12%" height="18" background="images/tab_14.gif"
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
							</td>
							<td width="9" background="images/tab_16.gif">
								&nbsp;
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="29">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="15" height="29">
								<img src="images/tab_20.gif" width="15" height="29" />
							</td>
							<td background="images/tab_21.gif">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="25%" height="29" nowrap="nowrap">
											<span class="STYLE1"><br /></span>
										</td>
										<td width="75%" valign="top" class="STYLE1">
											<div align="right">
												<table width="352" height="20" border="0" cellpadding="0"
													cellspacing="0">
													<tr>
														<td width="62" height="22" valign="middle">
															<div align="right">
																<img src="images/first.gif" width="37" height="15" />
															</div>
														</td>
														<td width="50" height="22" valign="middle">
															<div align="right">
																<img src="images/back.gif" width="43" height="15" />
															</div>
														</td>
														<td width="54" height="22" valign="middle">
															<div align="right">
																<img src="images/next.gif" width="43" height="15" />
															</div>
														</td>
														<td width="49" height="22" valign="middle">
															<div align="right">
																<img src="images/last.gif" width="37" height="15" />
															</div>
														</td>
														<td width="59" height="22" valign="middle">
															<div align="right">
																转到第
															</div>
														</td>
														<td width="25" height="22" valign="middle">
															<span class="STYLE7"> <input name="textfield"
																	type="text" class="STYLE1"
																	style="height: 10px; width: 25px;" size="5" /> </span>
														</td>
														<td width="23" height="22" valign="middle">
															页
														</td>
														<td width="30" height="22" valign="middle">
															<img src="images/go.gif" width="37" height="15" />
														</td>
													</tr>
												</table>
											</div>
										</td>
									</tr>
								</table>
							</td>
							<td width="14">
								<img src="images/tab_22.gif" width="14" height="29" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>

