<%@ page contentType="text/html; charset=GBK" language="java" import="java.util.*" pageEncoding="GBK"%>
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
      var s1=form14.loadname.value;
      //自动获取，不设textfield
     
      //必须选择一类型
      var s2=form14.loadurl.value;
      
       if(s1==""){ alert("请输入文件名!");form14.loadname.focus();form14.loadname.select();return false;}
       if(s2==""){ alert("请上传文件!");form14.loadurl.focus();form14.loadurl.select();return false;}
       return true;    
}
//-->
</script>
</head>

<body onload="MM_preloadImages('images/main_26_1.gif')">
<form id="form14" name="form14" method="post" action="tab/uploadadd.jsp" enctype="multipart/form-data" onsubmit="return confirm(this);"   >
<table width="178" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="206" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed">
      <tr>
        <td height="26" background="images/main_21.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="80" style="background-image:url(images/main_23.gif); background-repeat:repeat-x;"><table width="86%" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="50%" height="45"><div align="center"><img src="images/main_26.gif" name="Image1" width="40" height="40" border="0" id="Image1" /></div></td>
            </tr>
          <tr>
            <td height="25"><div align="center" class="STYLE2">附件新增</div></td>
            </tr>
        </table></td>
      </tr>
      <tr>
        <td  style="line-height:4px; background:url(images/main_38.gif)">&nbsp;</td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3"><table width="189" border="0">
          <tr>
            <td width="183"><br /></td>
          </tr>
          <tr>
            <td><table width="183" border="0">
              <tr>
                <td width="40" rowspan="2"><a href="#"><img src="images/main_26.gif" alt="" name="Image22" width="40" height="40" border="0" id="Image22" onmouseover="MM_swapImage('Image22','','images/main_26_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></td>
                <td width="133" height="23"><div align="center"><span class="STYLE2">上传附件</span></div></td>
              </tr>
              <tr>
                <td height="15">
                  <label>
                    <input name="loadurl" type="file" id="loadurl" size="5" />
                    </label>
                         </td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="21">&nbsp;</td>
          </tr>
        </table>
        
            <label>
            </label>
            <table width="184" border="0">
              <tr>
                <td width="79"><div align="center">
                  <input type="submit" name="button" id="button" value="提交" />
                </div></td>
                <td width="95"><div align="center">
                  <input type="reset" name="button2" id="button2" value="重置" />
                </div></td>
              </tr>
              <tr>
                <td colspan="2"><div align="center" class="STYLE2"><a href="/technologyapprove/technologymanagementsys/left.jsp" target="I2"    onclick="javascript:window.open('/technologyapprove/technologymanagementsys/tab/tab.jsp','I1');">返回</a></div></td>
                </tr>
            </table>
            <div align="center"></div>
                  </td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>
