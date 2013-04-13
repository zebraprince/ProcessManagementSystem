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
.STYLE5 {color: #000000}
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
//-->
</script>
</head>

<body onload="MM_preloadImages('images/main_26_1.gif','images/main_29_1.gif')">
<table width="177" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed">
      <tr>
        <td height="26" background="images/main_21.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="80" style="background-image:url(images/main_23.gif); background-repeat:repeat-x;"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="50%" height="45"><div align="center"><img src="images/main_26.gif" name="Image1" width="40" height="40" border="0" id="Image1"  /></div></td>
            <td width="50%"><div align="center"><a href="#"><img src="images/main_28.gif" name="Image2" width="40" height="40" border="0" usemap="#Image2Map" id="Image2" /></a></div></td>
            </tr>
          <tr>
            <td height="25"><div align="center" class="STYLE2">用户组织管理</div></td>
            <td><div align="center" class="STYLE2"><a href="tab/loadmananage.jsp" target="I1" class="STYLE5">下载管理</a></div></td>
            </tr>
        </table></td>
      </tr>
      <tr>
        <td  style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3"><table width="208" height="169" border="0">
          <tr>
            <td width="202"><table width="203" border="0">
              <tr>
                <td width="197" bgcolor="#f3ffe3"><table width="174" border="0">
                  <tr>
                    <td width="43" rowspan="3"><img src="images/main_26.gif" alt="" name="Image41" width="40" height="40" border="0" usemap="#Image41Map" id="Image41" /></td>
                    <td width="147">&nbsp;</td>
                  </tr>
                  <tr>
                    <td><div align="center" class="STYLE2">用户组织管理</div></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td bgcolor="#f3ffe3"><table width="177" border="0">
                  <tr>
                    <td width="51"><div align="center"><img src="images/icon1.gif" width="40" height="43" border="0" usemap="#Map" /></div></td>
                    <td width="61"><div align="center"><img src="images/icon2.gif" width="47" height="43" border="0" usemap="#Map2" /></div></td>
                    <td width="51"><div align="left"><img src="images/icon3.gif" width="50" height="43" border="0" usemap="#Map3" /></div></td>
                  </tr>
                  <tr>
                    <td><a href="tab/usermanage.jsp" target="I1">用户管理</a></td>
                    <td><a href="tab/usergroup.jsp" target="I1">用户组管理</a></td>
                    <td><a href="tab/detail.jsp" target="I1">权限明细</a></td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td bgcolor="#f3ffe3"><table width="194" border="0">
              <tr>
                <td width="200"><table width="172" border="0">
                  <tr>
                    <td width="46" rowspan="3"><a href="#"><img src="images/main_28.gif" alt="" name="Image42" width="40" height="40" border="0" usemap="#Image42Map" id="Image42" onmouseover="MM_swapImage('Image42','','images/main_29_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></td>
                    <td width="116">&nbsp;</td>
                  </tr>
                  <tr>
                    <td><div align="center"><a href="tab/loadmananage.jsp" target="I1">下载管理</a><a href="#" class="STYLE5"></a></div></td>
                  </tr>
                  <tr>
                    <td height="15">&nbsp;</td>
                  </tr>
                </table></td>
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
</table>

<map name="Map" id="Map">
<area shape="circle" coords="20,21,18" href="tab/usermanage.jsp" target="I1" />
</map>
<map name="Map2" id="Map2">
<area shape="circle" coords="23,21,22" href="tab/usergroup.jsp" target="I1" />
</map>
<map name="Map3" id="Map3">
<area shape="circle" coords="24,20,24" href="tab/detail.jsp" target="I1" />
</map>
<map name="Image42Map" id="Image42Map"><area shape="rect" coords="0,2,39,40" href="tab/loadmananage.jsp" target="I1" /></map>
<map name="Image2Map" id="Image2Map">
<area shape="rect" coords="1,0,43,42" href="tab/loadmananage.jsp" target="I1" />&nbsp;</map><map name="Image41Map" id="Image41Map"></map></body>
</html>