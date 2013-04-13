<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
.STYLE1 {font-size: 12px}
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
.STYLE16 {
	font-family: "华文楷体";
	font-size: xx-large;
	color: #008000;
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
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="10" height="30"  background="images/tab_03.gif" > </td>
        <td width="559" background="images/tab_05.gif"><img src="approveSystem/images/311.gif" width="16" height="16" /> <span class="STYLE4">审批成功</span></td>
        <td width="422" background="images/tab_05.gif">&nbsp;</td>
        <td width="11" background="images/tab_07.gif"></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="7" background="images/tab_12.gif">&nbsp;</td>
        <td width="987" bgcolor="#f3ffe3"><p>&nbsp;</p>
          <p align="center" class="STYLE16">&nbsp;</p>
          <p align="center" class="STYLE16">&nbsp;</p>
          <p align="center" class="STYLE16">&nbsp;</p>
          <p align="center" class="STYLE16">&nbsp;</p>
          <p align="center" class="STYLE16"><img src="approveSystem/images/2.JPG" width="98" height="99" />提交审批成功！~</p>
          <p align="center" class="STYLE16">&nbsp;</p>
          <p align="center" class="STYLE16">&nbsp;</p>
          <p align="center" class="STYLE16"><a href="approveSystem/mainTab/tab.jsp"><img src="approveSystem/images/002.gif" width="14" height="14" />返回首页</a></p>
          <p align="center" class="STYLE16">&nbsp;</p></td>
        <td width="10" background="images/tab_16.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="29"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15" height="29"><img src="images/tab_20.gif" width="15" height="29" /></td>
        <td background="images/tab_21.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="25%" height="29" nowrap="nowrap">&nbsp;</td>
            <td width="75%" valign="top" class="STYLE1"><div align="right">
              <table width="352" height="20" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="62" height="22" valign="middle">&nbsp;</td>
                  <td width="50" height="22" valign="middle">&nbsp;</td>
                  <td width="54" height="22" valign="middle">&nbsp;</td>
                  <td width="49" height="22" valign="middle">&nbsp;</td>
                  <td width="59" height="22" valign="middle">&nbsp;</td>
                  <td width="25" height="22" valign="middle">&nbsp;</td>
                  <td width="23" height="22" valign="middle">&nbsp;</td>
                  <td width="30" height="22" valign="middle">&nbsp;</td>
                </tr>
              </table>
            </div></td>
          </tr>
        </table></td>
        <td width="14"><img src="images/tab_22.gif" width="14" height="29" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
