<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			System.out.println("bbbbbbbbbbbbbbbbb");
	List<List<String>> list=(List<List<String>>)session.getAttribute("list");

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
				<td height="30">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="10" height="30" background="images/tab_03.gif">
							</td>
							<td width="559" background="images/tab_05.gif">
								<img src="images/311.gif" width="16" height="16" />
								<span class="STYLE4">我的申请列表 </span>
							</td>
							<td width="422" background="images/tab_05.gif">
								&nbsp;
							</td>
							<td width="11" background="images/tab_07.gif"></td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">

						<tr>
							<td width="7" background="images/tab_12.gif">
								&nbsp;
							</td>
							<td width="987" bgcolor="#f3ffe3">
								<p>
									&nbsp;
								</p>
								<table width="534" border="0">
									<tr>
										<td height="47">
											<img src="images/main_281.gif" width="40" height="40" />
											<span class="STYLE10">我的申请列表</span>
										</td>
									</tr>
								</table>
								<p>
									&nbsp;
								</p>
								<p>
									&nbsp;
								</p>
								<%
									if (list.size() == 0) {
								%>
								<table width="89%" border="0" align="center" cellpadding="0"
									cellspacing="1" bgcolor="#c0de98">

									<tr>

										<td align="center">
											<h1>
												没有可显示的项目！
											</h1>
										</td>

									</tr>
								</table>
								<%
									} else {
								%>
								<table width="89%" border="0" align="center" cellpadding="0"
									cellspacing="1" bgcolor="#c0de98" onmouseover="changeto()"
									onmouseout="changeback()">
									  <tr>
              <td width="7%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center">项目id
              </div>
                <div align="center" class="STYLE2 STYLE1"></div></td>
              <td width="45%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">项目名称</div></td>
              <td width="12%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">项目提交时间</div></td>
              <td width="12%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">项目当前阶段</div></td>
              <td width="12%" background="images/tab_14.gif" class="STYLE1"><div align="center">项目状态</div></td>
              <td width="12%" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2">查看详细信息</div></td>
            </tr>
									<%
										for (int i = 0; i < list.size(); i++) {
												List<String> gy = list.get(i);
												String pid = gy.get(0);
												String pname = gy.get(1);
												String ptime = gy.get(2);

												String stateString=gy.get(3);
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
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1"><%=stateString%></div>
										</td>
										<td height="18" bgcolor="#FFFFFF">
											<div align="center" class="STYLE2 STYLE1">待审批</div>
										</td>
										 <td bgcolor="#FFFFFF"><div align="center"><img src="images/a1.gif" width="9" height="9" /><span class="STYLE1"> [</span><a href="particularInfo.jsp" target="_blank">查看</a><span class="STYLE1">]</span></div></td>
										
									</tr>

									<%
										}
									%>
								</table>
								<p align="center">
									&nbsp;
								</p>
					
									<label>
										<div align="center">
             									   <input type="submit" name="button" id="button" onclick="javascript:window.open('./applicationSystem/mainTab/tab1Excel.jsp');" value="导出excel" />
         							     </div>
									</label>

								<p>
									&nbsp;
								</p>
								<p align="center">
									&nbsp;
								</p>
								<p align="center">
									&nbsp;
								</p>
							</td>
							<td width="10" background="images/tab_16.gif">
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
											<span class="STYLE1">共145条纪录，当前第1/10页，每页15条纪录</span>
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
			<%
				}
			%>
		</table>
	</body>
</html>
