<%@ page language="java" import="java.util.*,com.chinasofti.service.impl.*,com.chinasofti.domain.*,com.chinasofti.service.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String userID = (String)session.getAttribute("test1");
IUserService us = GetService.getUserService();
List<User> list = us.showUser();

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

 function P1()
		 {     
		        var lst[] = document.getElementsByName("userID");
		        var j = 0;
		        for(i=0;i<lst.length;i++){
		         if(lst[i].checked){
		          
		 		  j++;
		 		  }
		 		 } 	
		 		 if(j==0)
		 		 {
		 		  alert("success")
		 		 }
		  
		 }
</script>
</head>

<body>
<FORM METHOD="POST" ACTION="userdel.jsp"  target="I2" name="form1"  onsubmit="return p1();">
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15" height="30"><img src="images/tab_03.gif" width="15" height="30" /></td>
        <td width="1101" background="images/tab_05.gif"><img src="images/311.gif" width="16" height="16" /> <span class="STYLE4">用户列表</span></td>
        <td width="281" background="images/tab_05.gif"><table border="0" align="right" cellpadding="0" cellspacing="0">
            <tr>
              <td width="60"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"><img src="images/001.gif" alt="" width="14" height="14" /></div></td>
                    <td class="STYLE1"><a href="/technologyapprove/technologymanagementsys/useradd.jsp" target="I2">新增</a></td>
                  </tr>
              </table></td>
              
              <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"><img src="images/083.gif" alt="" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center"><a href=javascript:form1.submit(); >删除</a></div></td>
                  </tr>
              </table></td>
              <td width="52"><table width="88%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"><img src="images/083.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center"><a href="tab.jsp" target="I1">退出</a></div></td>
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
            <td width="3%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">选择</div></td>
            <td width="4%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">用户ID</div></td>
            <td width="10%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">登陆名</div></td>
            <td width="6%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">密码</div></td>
            <td width="7%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">真实姓名</div></td>
            <td width="9%" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">所属用户组</div></td>
            <td width="9%" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">公司职务</div></td>
            <td width="13%" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">所属分公司</div></td>
            <td width="11%" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">联系地址</div></td>
            <td width="9%" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">电话</div></td>
            <td width="8%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2">编辑</div></td>
            <td width="11%" height="26" background="images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2">删除</div></td>
          <%for(int i = list.size()-1;i >=0;i--) {
          User user = list.get(i);
          String pid = user.getUid()+"";
          String name = user.getUname()+"";
          String pwd = user.getPassword();
          String realname = user.getRealname();
          String usergroup = user.getDuty();
          String position = user.getPosition();
          String subcom = user.getDep();
          String adr = user.getAdr();
          String tel = user.getTel();
          %>
          
          
          </tr>
          <tr>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <input name="userID" type="checkbox" class="STYLE2" value="<%= pid %>" />
            </div></td>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1"><%=pid %></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%=name %></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1">******</div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%= realname %></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%= usergroup %></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%= position %></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%= subcom %></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%= adr %></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%= tel %></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><img src="images/037.gif" width="9" height="9" /><span class="STYLE1"> [</span><a href="/technologyapprove/technologymanagementsys/userchange.jsp?changeid=<%=pid %>&&name=<%=name %>&&pwd=<%=pwd %>&&realname=<%=realname %>&&adr=<%=adr %>&&tel=<%=tel %>&&position=<%=position %>"  target="I2">编辑</a><span class="STYLE1">]</span></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center"><span class="STYLE2"><img src="images/010.gif" width="9" height="9" /> </span><span class="STYLE1">[</span><a href="userdelone.jsp?delid=<%=pid %>" target="I2">删除</a><span class="STYLE1">]</span></div></td>
          </tr>
          <%} %>
                  
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
            <td width="25%" height="29" nowrap="nowrap"><br /></td>
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
</FORM>
</body>
</html>
