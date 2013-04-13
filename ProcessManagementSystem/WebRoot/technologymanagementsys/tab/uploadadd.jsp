<%@ page contentType="text/html; charset=GBK" language="java" 
import="java.util.*,com.jspsmart.upload.*" errorPage="" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>文件上传处理页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
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
<%
 // 新建一个SmartUpload对象
 SmartUpload su = new SmartUpload();
 // 上传初始化
 su.initialize(pageContext);
 // 设定上传限制
 // 1.限制每个上传文件的最大长度。
 // su.setMaxFileSize(10000);
 // 2.限制总上传数据的长度。
 // su.setTotalMaxFileSize(20000);
 // 3.设定允许上传的文件（通过扩展名限制）,仅允许doc,txt文件。
 // su.setAllowedFilesList("doc,txt");
 // 4.设定禁止上传的文件（通过扩展名限制）,禁止上传带有exe,bat,
 //jsp,htm,html扩展名的文件和没有扩展名的文件。
 // su.setDeniedFilesList("exe,bat,jsp,htm,html,,");
 // 上传文件
 su.upload();
 // 将上传文件全部保存到指定目录
 int count = su.save("/upload");
 //out.println(count+"个文件上传成功！<br>");
 
 // 利用Request对象获取参数之值
 //out.println("TEST="+su.getRequest().getParameter("TEST")
 //+"<BR><BR>");

 // 逐一提取上传文件信息，同时可保存文件。

  com.jspsmart.upload.File file = su.getFiles().getFile(0);
  
  // 若文件不存在则继续
  
  
  // 显示当前文件信息

  // 将文件另存
  // file.saveAs("/upload/" + myFile.getFileName());
  // 另存到以WEB应用程序的根目录为文件根目录的目录下
  // file.saveAs("/upload/" + myFile.getFileName(),  su.SAVE_VIRTUAL);
  // 另存到操作系统的根目录为文件根目录的目录下
  // file.saveAs("c:\\temp\\" + myFile.getFileName(), su.SAVE_PHYSICAL);
 
 
 int filesize = file.getSize();
 String filename = file.getFileName();
 String fileext = file.getFileExt();
%>

<form id="form1" name="form1" method="post" action="/technologyapprove/technologymanagementsys/loadd.jsp">
<table width="180"  height="100" border="0"  cellpadding="0" cellspacing="0">
  <tr>
    <td height="30" bgcolor="#f3ffe3"><table width="176" height="36" border="0" cellpadding="1" cellspacing="0">
      <tr>
      
        <td height="23" background="images/tab_05.gif"> <span class="STYLE2">添加成功</span></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="174" border="0" cellspacing="0" cellpadding="0" height="102" style="width: 174px; height: 108px;">
      <tr>
        
        <td width="216" bgcolor="#f3ffe3"><p align="center" class="STYLE1">文件名称为<%= filename %></p>
          <p align="center" class="STYLE1">文件大小为<%= filesize %></p>
          <p align="center" class="STYLE1">文件扩展名<%= fileext %></p>
          </td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3">
          <label>
            <div align="center">
              <input type="submit" name="button" id="button" value="确定" onclick="javascript:parent.I1.location.reload(); "/>
              <input type="submit" name="button2" id="button2" value="取消" />
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

</body>



</html>