<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
.STYLE7 {font-size: 12}

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
        <td width="15" height="30"><img src="images/tab_03.gif" width="15" height="30" /></td>
        <td width="1101" background="images/tab_05.gif"><img src="images/311.gif" width="16" height="16" /> <span class="STYLE4">权限明细列表</span></td>
        <td width="281" background="images/tab_05.gif"><table border="0" align="right" cellpadding="0" cellspacing="0">
            <tr>
              <td width="60"><table width="87%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"></div></td>
                    <td class="STYLE1"><div align="center"></div></td>
                  </tr>
              </table></td>
              <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1">&nbsp;</td>
                    <td class="STYLE1">&nbsp;</td>
                  </tr>
              </table></td>
              <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1">&nbsp;</td>
                    <td class="STYLE1">&nbsp;</td>
                  </tr>
              </table></td>
              <td width="52"><table width="88%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"></div></td>
                    </tr>
              </table></td>
            </tr>
        </table></td>
        <td width="14"><img src="images/tab_07.gif" width="14" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="9" background="images/tab_12.gif">&nbsp;</td>
        <td bgcolor="#f3ffe3"><table width="99%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#c0de98" onmouseover="changeto()"  onmouseout="changeback()">
          <tr>
            <td width="16%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">权限代号</div></td>
            <td width="19%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">权限名称</div></td>
            <td width="65%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">具体描述</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">0</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">申报权限 </div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">可以进行新项目的申报</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">1</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">审批一级权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">最低级的审批权限，可以驳回申请，终止审批过程 </div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">2</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">审批二级权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">二级审批权限，不具有驳回申请的权限，需要满足上一级审批</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">3</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">审批三级权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">三级审批权限，需要满足上一级审批，可以选择审批通过使项目满足该等级审批；可以驳回申请，终止审批过程</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">4</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">审批四级权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">四级审批权限，需要满足上一级审批，可以选择审批通过使项目满足该等级审批；可以驳回申请，终止审批过程</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">5</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">审批最高权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">最高审批权限，需要满足上一级审批，可以选择审批通过使项目满足该等级审批，完成审批过程；可以驳回申请，终止审批过程</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">6</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">系统管理员权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">对系统进行管理</div></td>
            </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">7</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">科技项目管理员权限</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">可以对项目进行管理</div></td>
            </tr>
          
        </table></td>
        <td width="9" background="images/tab_16.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="29"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15" height="29"><img src="images/tab_20.gif" width="15" height="29" /></td>
        <td background="images/tab_21.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="25%" height="29" nowrap="nowrap"><span class="STYLE1">共8条纪录，当前第1/1页，每页10条纪录</span></td>
            <td width="75%" valign="top" class="STYLE1"><div align="right">
              <table width="352" height="20" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="62" height="22" valign="middle"><div align="right"><img src="images/first.gif" width="37" height="15" /></div></td>
                  <td width="50" height="22" valign="middle"><div align="right"><img src="images/back.gif" width="43" height="15" /></div></td>
                  <td width="54" height="22" valign="middle"><div align="right"><img src="images/next.gif" width="43" height="15" /></div></td>
                  <td width="49" height="22" valign="middle"><div align="right"><img src="images/last.gif" width="37" height="15" /></div></td>
                  <td width="59" height="22" valign="middle"><div align="right">转到第</div></td>
                  <td width="25" height="22" valign="middle"><span class="STYLE7">
                    <input name="textfield" type="text" class="STYLE1" style="height:10px; width:25px;" size="5" />
                  </span></td>
                  <td width="23" height="22" valign="middle">页</td>
                  <td width="30" height="22" valign="middle"><img src="images/go.gif" width="37" height="15" /></td>
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
