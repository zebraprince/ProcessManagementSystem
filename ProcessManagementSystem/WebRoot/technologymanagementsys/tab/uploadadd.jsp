<%@ page contentType="text/html; charset=GBK" language="java" 
import="java.util.*,com.jspsmart.upload.*" errorPage="" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>�ļ��ϴ�����ҳ��</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>
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
//�˴�clickcolorֻ����winϵͳ��ɫ������ܳɹ�,�����#xxxxxx�Ĵ���Ͳ���,��û�����Ϊʲô:(
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
 // �½�һ��SmartUpload����
 SmartUpload su = new SmartUpload();
 // �ϴ���ʼ��
 su.initialize(pageContext);
 // �趨�ϴ�����
 // 1.����ÿ���ϴ��ļ�����󳤶ȡ�
 // su.setMaxFileSize(10000);
 // 2.�������ϴ����ݵĳ��ȡ�
 // su.setTotalMaxFileSize(20000);
 // 3.�趨�����ϴ����ļ���ͨ����չ�����ƣ�,������doc,txt�ļ���
 // su.setAllowedFilesList("doc,txt");
 // 4.�趨��ֹ�ϴ����ļ���ͨ����չ�����ƣ�,��ֹ�ϴ�����exe,bat,
 //jsp,htm,html��չ�����ļ���û����չ�����ļ���
 // su.setDeniedFilesList("exe,bat,jsp,htm,html,,");
 // �ϴ��ļ�
 su.upload();
 // ���ϴ��ļ�ȫ�����浽ָ��Ŀ¼
 int count = su.save("/upload");
 //out.println(count+"���ļ��ϴ��ɹ���<br>");
 
 // ����Request�����ȡ����ֵ֮
 //out.println("TEST="+su.getRequest().getParameter("TEST")
 //+"<BR><BR>");

 // ��һ��ȡ�ϴ��ļ���Ϣ��ͬʱ�ɱ����ļ���

  com.jspsmart.upload.File file = su.getFiles().getFile(0);
  
  // ���ļ������������
  
  
  // ��ʾ��ǰ�ļ���Ϣ

  // ���ļ����
  // file.saveAs("/upload/" + myFile.getFileName());
  // ��浽��WEBӦ�ó���ĸ�Ŀ¼Ϊ�ļ���Ŀ¼��Ŀ¼��
  // file.saveAs("/upload/" + myFile.getFileName(),  su.SAVE_VIRTUAL);
  // ��浽����ϵͳ�ĸ�Ŀ¼Ϊ�ļ���Ŀ¼��Ŀ¼��
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
      
        <td height="23" background="images/tab_05.gif"> <span class="STYLE2">��ӳɹ�</span></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="174" border="0" cellspacing="0" cellpadding="0" height="102" style="width: 174px; height: 108px;">
      <tr>
        
        <td width="216" bgcolor="#f3ffe3"><p align="center" class="STYLE1">�ļ�����Ϊ<%= filename %></p>
          <p align="center" class="STYLE1">�ļ���СΪ<%= filesize %></p>
          <p align="center" class="STYLE1">�ļ���չ��<%= fileext %></p>
          </td>
      </tr>
      <tr>
        <td bgcolor="#f3ffe3">
          <label>
            <div align="center">
              <input type="submit" name="button" id="button" value="ȷ��" onclick="javascript:parent.I1.location.reload(); "/>
              <input type="submit" name="button2" id="button2" value="ȡ��" />
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