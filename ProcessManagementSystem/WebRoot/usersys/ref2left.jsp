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
.STYLE2 {color: #43860c; font-size: 12px; }

a:link {font-size:12px; text-decoration:none; color:#43860c;}
a:visited {font-size:12px; text-decoration:none; color:#43860c;}
a:hover{font-size:12px; text-decoration:none; color:#FF0000;}
.STYLE7 {color: #43860c}
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
function confirm(form5)
   {
      var s1=form5.all.reftype.value;
      //自动获取，不设textfield
     
      //必须选择一类型
      var s2=form5.refyear.value;
      
       if(s1==""||s1=="0"){ alert("请输入项目类型!");form5.reftype.focus();return false;}
       if(s2==""){ alert("请输入项目年份!");form5.refyear.focus();form5.refyear.select();return false;}
        else if(isNaN(s2)){alert("项目年份必须为数字!");form5.refyear.focus();form5.refyear.select();return false;}
       return true;    
}
//-->
</script>
</head>

<body onLoad="setfocus()">
<form id="form5" name="form5" method="post" action="/technologyapprove/user.do" onsubmit="return confirm(this);">
<table width="192" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="192" valign="top"><table width="97%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed">
      <tr>
        <td height="26" background="images/main_21.gif">&nbsp;</td>
      </tr>
      <tr></tr>
      <tr>
        <td  style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3"><table width="191" height="169" border="0">
          <tr>
            <td width="185"><table width="182" border="0">
              <tr>
                <td width="176" bgcolor="#f3ffe3"><table width="167" border="0">
                  <tr>
                    <td width="78" rowspan="3"><div align="center"><img src="images/main_28.gif" alt="" name="Image42" width="40" height="40" border="0" usemap="#Image42Map" id="Image42" /></div></td>
                    <td width="79">&nbsp;</td>
                  </tr>
                  <tr>
                    <td><div align="center" class="STYLE2">圆饼图统计</div></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
              </tr>
              
            </table></td>
          </tr>
          <tr>
            <td bgcolor="#f3ffe3"><table width="182" border="0">
              <tr>
                <td width="176"><table width="166" border="0">
                  
                  <tr>
                    <td>&nbsp;</td>
                    <td>
                      <label></label>
                    
                      <label>
                      <select name="reftype" id="reftype" style="rect(2 80 20 2);margin:-2;width:40;background:#f3ffe3">
                        <option value="0">项目类型</option>
                        <option value="1">类型1</option>
                        <option value="2">类型2</option>
                        <option value="3">类型3</option>
                      </select>
                      </label>
                      <label></label>
                                        </td>
                  </tr>
                  <tr>
                    <td><span class="STYLE2">年份</span></td>
                    <td><input name="refyear" type="text" id="refyear" size="13" /></td>
                  </tr>
                  <tr>
                    <td height="25">
                      <label>
                        <div align="center">
                          <input type="submit" name="button" id="button" value="查询" onclick="javascript:window.open('/technologyapprove/usersys/tab/tabto2.jsp','I1');"/>
                        </div>
                      </label>
                                      </td>
                    <td>
                      <label>
                        <div align="center">
                          <input type="reset" name="button2" id="button2" value="重置" />
                        </div>
                      </label>
                                   </td>
                  </tr>
                
                </table>
               
                  </td>
              </tr>
              <tr>
                <td style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
              </tr>
              <tr>
                <td><table width="176" border="0">
                  <tr>
                    <td width="44" rowspan="3"><a href="#"><img src="images/main_28.gif" alt="" name="Image1" width="40" height="40" border="0" usemap="#Image1Map" id="Image1" onmouseover="MM_swapImage('Image1','','images/main_29_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></td>
                    <td width="125">&nbsp;</td>
                  </tr>
                  <tr>
                    <td><div align="center" class="STYLE7"><a href="/technologyapprove/usersys/left.jsp" target="I2" onclick="javascript:window.open('/technologyapprove/usersys/tab/tab.jsp','I1');">返回主菜单</a></div></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
<map name="Image1Map" id="Image1Map">
<area shape="rect" coords="2,0,38,43" href="/technologyapprove/usersys/left.jsp" target="I2" onclick="javascript:window.open('/technologyapprove/usersys/tab/tab.jsp','I1');"/>
</map>
<map name="Image42Map" id="Image42Map">

</map></body>
</html>
