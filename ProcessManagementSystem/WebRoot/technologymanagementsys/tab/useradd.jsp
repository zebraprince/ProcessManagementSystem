<%@ page language="java" import="java.util.*,com.chinasofti.service.impl.*,com.chinasofti.domain.*,com.chinasofti.service.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String userID = (String)session.getAttribute("userID");
String username = (String)session.getAttribute("username");
String userpwd = (String)session.getAttribute("userpwd");
String name = (String)session.getAttribute("name");
String usergroup = (String)session.getAttribute("usergroup");
String userclass = (String)session.getAttribute("userclass");
String usermodle = (String)session.getAttribute("usermodle");
String useraddres = (String)session.getAttribute("useraddres");
String userphone = (String)session.getAttribute("userphone");


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
.STYLE1 {font-size: 12px}

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
.STYLE2 {font-size: 13px}

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
<form id="form2" name="form2" method="post" action="tmback.do">
<table width="180"  height="100%" border="0"  cellpadding="0" cellspacing="0">
  <tr>
    <td height="30" bgcolor="#f3ffe3"><table width="100%" height="30" border="0" cellpadding="1" cellspacing="0">
      <tr>
      
        <td height="23" background="images/tab_05.gif"> <span class="STYLE2">添加成功！</span><br /></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="99%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        
        <td width="216" bgcolor="#f3ffe3"><p align="center" class="STYLE1">添加内容成功！<br /></p>
          <p>&nbsp;</p></td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3">
          <label>
            <div align="center">
              <input type="submit" name="button" id="button" value="确定" onclick="javascript:parent.I1.location.reload(); "/>
              
            </div>
          </label>
          <div align="center"></div>
              </td>
      </tr>
    </table></td>
  </tr>
  <tr>
    
  </tr>
</table>
</form>
</body>

</html>
