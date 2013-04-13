<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String name=(String)session.getAttribute("name");
if(name==null) name="";

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
	color: #43860c;
	font-size: 12px;
}
.STYLE4 {font-size: 12px}
.STYLE9 {	font-size: 24px;
	color: #009900;
	font-family: "华文楷体";
	font-weight: bold;
}
-->
</style></head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed;">
  <tr>
    <td height="9" style="line-height:9px; background-image:url(images/main_04.gif)"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>

        <td>&nbsp;</td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td height="47" background="images/main_09.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="143" height="40" ><img src="images/2.gif" width="142" height="48" /></td>
        <td width="1108"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="26%" valign="bottom"><span class="STYLE9">科技信息化管理系统</span></td>
              <td width="42%" height="23" valign="bottom"><img src="images/main_12.gif" alt="" width="265" height="23" border="0" usemap="#MapMap" /></td>
              <td width="32%" valign="bottom"><div align="right"><span class="STYLE4"><%=name%>, 您好，欢迎使用本系统！~今天是
              <script language=JavaScript>
today=new Date();
function initArray(){
this.length=initArray.arguments.length
for(var i=0;i<this.length;i++)
this[i+1]=initArray.arguments[i] }
var d=new initArray(
"星期日",
"星期一",
"星期二",
"星期三",
"星期四",
"星期五",
"星期六");
document.write(
"<font color=##000000 style='font-size:9pt;font-family: 宋体'> ",
today.getYear(),"年",
today.getMonth()+1,"月",
today.getDate(),"日",
d[today.getDay()+1],
"</font>" ); 
</script></span></div></td>
            </tr>
        </table></td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
        </table>
      </tr>
    </table>
      <map name="MapMap" id="MapMap">
        <area shape="rect" coords="224,-1,258,21" href="../login/login.jsp"  target="_parent"/>
        <area shape="rect" coords="169,0,203,21" href="#" onclick="window.history.go(0)" />
        <area shape="rect" coords="117,2,147,21" href="#" onclick="window.history.go(1)" />
        <area shape="rect" coords="67,2,98,21" href="#" onclick="window.history.go(-1)" />
        <area shape="rect" coords="18,1,51,22" href="tab/tab.jsp" target="I1"/>
    </map></td>
  </tr>
  <tr>
    <td height="5" style="line-height:5px; background-image:url(images/main_18.gif)"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="1012" height="7" background="images/main_16.gif"  style="line-height:5px;">&nbsp;</td>
        </tr>
    </table></td>
  </tr>
</table>

<map name="Map" id="Map"><area shape="rect" coords="3,1,49,22" href="#" /><area shape="rect" coords="52,2,95,21" href="#" /><area shape="rect" coords="102,2,144,21" href="#" /><area shape="rect" coords="150,1,197,22" href="#" /><area shape="rect" coords="210,2,304,20" href="#" /><area shape="rect" coords="314,1,361,23" href="#" /></map></body>
</html>
