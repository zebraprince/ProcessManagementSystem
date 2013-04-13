<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String realname=(String)session.getAttribute("realname");
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
 function confirm(form)
   {
      var s1=form.projectname.value;
     
      //必须为数字
      var s3=form.projecttime.value;
      //必须选择一类型
      var s4=form.all.projecttype.value;
      //必须为数字
      var s5=form.projectcost.value;
      var s6=form.content.value;
      var s7=form.formFile.value;
      
       if(s1==""){ alert("请输入项目名称!");form.projectname.focus();form.projectname.select(); return false;}
       
       if(s3==""){ alert("请输入项目所需时间!");form.projecttime.focus();form.projecttime.select();return false;}
    else if(isNaN(s3)){alert("项目时间必须为数字!");form.projecttime.focus();form.projecttime.select();return false;}
    
     if(s4==""||s4=="0"){alert("请选择项目类型!");form.projecttype.focus();return false;}
     
         
       if(s5==""){ alert("请输入项目所需经费!");form.projectcost.focus();form.projectcost.select();return false;}
    else if(isNaN(s5)){alert("项目经费必须为数字!");form.projectcost.focus();form.projectcost.select();return false;}
    
      if(s6==""){ alert("请输入项目内容!");form.content.focus();form.content.select();return false;}
       return true;    
       
}     
</script>
</head>

<body onLoad="setfocus()">
<form name="form" id="form" action="/technologyapprove/lixiangshengqing.do" method="post" enctype="multipart/form-data" onsubmit="return confirm(this);" >
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="10" height="30"  background="images/tab_03.gif" > </td>
        <td width="559" background="images/tab_05.gif"><img src="images/311.gif" width="16" height="16" /> <span class="STYLE4">立项申请报表
          
        </span></td>
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
          <table width="926" border="0">
            <tr>
              <td width="835" height="47"><img src="images/main_281.gif" width="40" height="40" /><span class="STYLE10">科技项目立项申请报表</span></td>
              <td width="81">&nbsp;</td>
            </tr>
          </table>
          <table width="613" border="0" align="center">
            <tr>
              <td width="112"><span class="STYLE15">项目名称：</span></td>
              <td width="491"><input name="projectname" type="text" id="projectname" size="33" /></td>
            </tr>
            <tr>
              <td><span class="STYLE15">申请人：</span></td>
              <td><%=realname %></td>
            </tr>
            <tr>
              <td><span class="STYLE15">项目所需时间：</span></td>
              <td><input type="text" name="projecttime" id="projecttime" /><span class="STYLE15">(工作日)</span></td>
            </tr>
            <tr>
              <td rowspan="2"><span class="STYLE15">申报类型：</span></td>
              <td>
                <label></label>
                       </td>
            </tr>
            <tr>
              <td>
              
              <select name="projecttype" id="peojecttype">
                <option value="0" >请选择类型</option>
                <option value="1" >type1</option>
                <option value="2">type2</option>
                <option value="3">type3</option>
              </select></td>
            </tr>
            <tr>
              <td><span class="STYLE15">申报经费：</span></td>
              <td><input type="text" name="projectcost" id="peojectcost" /><span class="STYLE15">(万元)</span></td>
            </tr>
            <tr>
              <td><span class="STYLE15">申报内容及目的</span></td>
              <td>
                <label>
                  <textarea name="content" id="content" cols="60" rows="15"></textarea>
                  </label>
                       </td>
            </tr>
            <tr>
              <td><span class="STYLE15">附件：</span></td>
              <td><label>
                <input type="file" name="formFile" id="formFile" />
              </label></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><table width="200" border="0">
                <tr>
                  <td>
                    <label>
                      <div align="center"><input type="submit" style="width:50px;height:20px;cursor:hand" value="提交" ></div>
                    </label>
                          </td>
                  <td>
                    <label>
                      <div align="center">
                        <input type="reset" name="button2" style="width:50px;height:20px;cursor:hand" id="button2" value="重置" />
                      </div>
                    </label>
                            </td>
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
</form>
</body>
</html>

