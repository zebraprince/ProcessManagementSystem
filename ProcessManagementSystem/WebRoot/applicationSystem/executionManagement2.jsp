<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
.STYLE10 {
	font-size: 18px;
	font-family: "华文楷体";
	color: #2A5F00;
}
.STYLE15 {font-family: "华文楷体"; font-size: 16px; }

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
        <td width="559" background="images/tab_05.gif"><img src="images/311.gif" width="16" height="16" /> <span class="STYLE4">实施管理</span></td>
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
          <table width="921" border="0">
            <tr>
              <td width="840" height="47"><img src="images/main_281.gif" width="40" height="40" /><span class="STYLE10">科技项目实施管理信息报表</span></td>
              <td width="71"><span class="STYLE10"><a href="executionManagement.jsp"><img src="images/002.gif" width="14" height="14" /></a></span><a href="executionManagement.jsp"><span class="STYLE10">返回</span></a></td>
            </tr>
          </table>
          <table width="528" height="378" border="0" align="center">
            <tr>
              <td width="116"><span class="STYLE15">项目名称：</span></td>
              <td width="402"><input name="textfield" type="text" id="textfield" size="33" /></td>
            </tr>
            
            <tr>
              <td><span class="STYLE15">项目管理人：</span></td>
              <td><input type="text" name="textfield5" id="textfield6" /></td>
            </tr>
            <tr>
              <td><span class="STYLE15">当前支付情况：</span></td>
              <td><input type="text" name="textfield5" id="textfield11" /></td>
            </tr>
            
            <tr>
              <td><span class="STYLE15">项目当前进度：</span></td>
              <td><input type="text" name="textfield5" id="textfield5" /></td>
            </tr>
                <tr>
              <td><span class="STYLE15">项目研究报告</span></td>
              <td><label>
                <textarea name="textarea" id="textarea" cols="55" rows="10"></textarea>
              </label></td>
            </tr>
            
            
            <tr>
              <td><span class="STYLE15">附件：</span></td>
              <td><label>
                <input type="file" name="fileField" id="fileField" />
              </label></td>
            </tr>
            <tr>
              <td height="209"><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p></td>
              <td><table width="200" border="0">
                <tr>
                  <td><form id="form1" name="form1" method="post" action="">
                    <label>
                      <div align="center"><a href="submissionSuccess.jsp">提交</a></div>
                    </label>
                  </form>                  </td>
                  <td><form id="form2" name="form2" method="post" action="">
                    <label>
                      <div align="center">
                        <input type="submit" name="button2" id="button2" value="重置" />
                      </div>
                    </label>
                  </form>                  </td>
                </tr>
              </table></td>
            </tr>
          </table>
          <p align="center">&nbsp;</p></td>
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
