<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String id = request.getParameter("changeid");
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
String realname = request.getParameter("realname");
String adr = request.getParameter("adr");
String tel = request.getParameter("tel");
String position = request.getParameter("position");
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
.STYLE2 {color: #43860c; font-size: 12px; }

a:link {font-size:12px; text-decoration:none; color:#43860c;}
a:visited {font-size:12px; text-decoration:none; color:#43860c;}
a:hover{font-size:12px; text-decoration:none; color:#FF0000;}
.STYLE1 {font-size: 12px}
-->
</style>
<script type="text/JavaScript">
<!--

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}



 function confirm(form14)
   {
      
      //自动获取，不设textfield
      var s2=form14.username.value;
      //必须为数字
      var s3=form14.userpwd.value;
      //必须选择一类型
      var s4=form14.name.value;
      //必须为数字
      var s5=form14.all.usergroup.value;
      var s6=form14.userclass.value;
      var s7=form14.all.usermodle.value;
      var s8=form14.useraddress.value;
      var s9=form14.userphone.value;
      
      
      if(s2==""){alert("用户名不能为空");form14.username.focus();form14.username.select();return false;}
      if(s3==""){alert("用户密码不能为空");form14.userpwd.focus();form14.userpwd.select();return false;}
      if(s4==""){alert("用户真实姓名不能为空");form14.name.focus();form14.name.select();return false;}
      if(s5==""||s5=="0"){ alert("请输入用户组!");form14.usergroup.focus();return false;}
      if(s6==""){alert("用户公司职务不能为空");form14.userclass.focus();form14.userclass.select();return false;}
      if(s7==""||s7=="0"){ alert("请输入分公司!");form14.usermodle.focus();return false;}
      if(s8==""){alert("联系地址不能为空");form14.useraddress.focus();form14.useraddress.select();return false;}
      if(s9==""){alert("用户电话不能为空");form14.userphone.focus();form14.userphone.select();return false;}
       //if(s1==""||s1=="0"){ alert("请输入项目分公司!");form2.scomp.focus();return false;}
       //if(s2==""||s2=="0"){ alert("请输入项目所属部门!");form2.sfact.focus();return false;}
       //if(s3==""||s3=="0"){ alert("请输入项目分公司!");form2.smodle.focus();return false;}
       
       return true;    
}
//-->
</script>
</head>
<body onload="MM_preloadImages('images/main_26_1.gif')">
<form id="form14" name="form14" method="post" action="/technologyapprove/uchange.do"  onsubmit="return confirm(this);">
<table width="182" height="100%" border="0" cellpadding="0" cellspacing="0"style="table-layout:fixed">
  <tr>
    <td width="208" valign="top"><table width="93%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed">
      <tr>
        <td height="26" background="images/main_21.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="80" style="background-image:url(images/main_23.gif); background-repeat:repeat-x;"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="50%" height="45"><div align="center"><img src="images/main_26.gif" name="Image1" width="40" height="40" border="0" id="Image1" /></div></td>
            </tr>
          <tr>
            <td height="25"><div align="center" class="STYLE2">用户修改</div></td>
            </tr>
        </table></td>
      </tr>
      <tr>
        <td  style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3"><table width="185" height="169" border="0">
          <tr>
            <td width="200"><table width="179" border="0">
              <tr>
                <td width="67"><div align="center" class="STYLE2 STYLE1">用户ID</div></td>
                <td width="102"><input type="text" name="userID" id="userID" size="10" value="<%=id %>" readonly/></td>
              </tr>
              <tr>
                <td><div align="center"><span class="STYLE2 STYLE1">登陆名</span></div></td>
                <td><input name="username" type="text" id="username" size="10" value="<%=name %>"/></td>
              </tr>
              <tr>
                <td><div align="center"><span class="STYLE2 STYLE1">密码</span></div></td>
                <td><input name="userpwd" type="password" id="userpwd" size="10" value="<%=pwd %>"/></td>
              </tr>
              <tr>
                <td><div align="center"><span class="STYLE2 STYLE1">真实姓名</span></div></td>
                <td><input name="name" type="text" id="name" size="10" value="<%=realname %>"/></td>
              </tr>
              <tr>
                <td rowspan="2"><div align="center"><span class="STYLE2 STYLE1">所属用户组</span></div></td>
                <td>
                  <label></label>
                          </td>
              </tr>
              <tr>
                <td><select name="usergroup" id="usergroup">
                  <option value = "0">group</option>
                  <option value = "1">worker</option>
                  <option value = "2">chief1</option>
                  <option value = "3">chief2</option>
                  <option value = "4">chief3</option>
                  <option value = "5">chief4</option>
                  <option value = "6">chief5</option>
                  <option value = "7">management</option>
                  <option value = "8">admin</option>
                </select></td>
              </tr>
              <tr>
                <td><div align="center"><span class="STYLE2 STYLE1">公司职务</span></div></td>
                <td><input name="userclass" type="text" id="userclass" size="10" value = "<%=position %>"/></td>
              </tr>
              <tr>
                <td rowspan="2"><div align="center"><span class="STYLE2 STYLE1">所属分公司</span></div></td>
                <td><br /></td>
              </tr>
              <tr>
                <td><select name="usermodle" id="usermodle">
                  <option value = "0">分公司</option>
                  <option value = "1">分公司A</option>
                  <option value = "2">分公司B</option>
                  <option value = "3">分公司C</option>
                </select></td>
              </tr>
              <tr>
                <td><div align="center"><span class="STYLE2 STYLE1">联系地址</span></div></td>
                <td><input name="useraddress" type="text" id="address" size="10" value="<%=adr %>"/></td>
              </tr>
              <tr>
                <td><div align="center"><span class="STYLE2 STYLE1">电话</span></div></td>
                <td><input name="userphone" type="text" id="userphone" size="10" value="<%=tel %>"/></td>
              </tr>
            </table>
             
                <label>
                </label>
                <table width="177" border="0">
                  <tr>
                    <td width="74"><div align="center">
                      <input type="submit" name="button" id="button" value="提交" />
                    </div></td>
                    <td width="93"><div align="center">
                      <input type="reset" name="button2" id="button2" value="重置" />
                    </div></td>
                  </tr>
                  <tr>
                    <td colspan="2"><div align="center" class="STYLE2"><a href="/technologyapprove/technologymanagementsys/left.jsp" target="I2"    onclick="javascript:window.open('/technologyapprove/technologymanagementsys/tab/tab.jsp','I1');">返回</a></div></td>
                    </tr>
                </table>
                <div align="center"></div>
              
              <p>&nbsp;</p></td>
          </tr>
          
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>
