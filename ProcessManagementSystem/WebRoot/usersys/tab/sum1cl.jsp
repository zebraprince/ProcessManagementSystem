<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="application/msexcel" %>
<!-- 以上这行设定本网页为excel格式的网页 -->
<%
  response.setHeader("Content-disposition","attachment; filename=test2.xls"); 
  response.setContentType("application/vnd.ms-excel;charset=GBK"); 
   //以上这行设定传送到前端浏览器时的档名为test1.xls
   //就是靠这一行，让前端浏览器以为接收到一个excel档 
%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
int []wanted = (int[])session.getAttribute("wanted");
List<String> comp = (List<String>)session.getAttribute("comp");
String typedefine = (String)session.getAttribute("typedefine");
int q = Integer.parseInt((String)session.getAttribute("q"));
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

<table width="99%" border="0" align="center" cellpadding="0" cellspacing="1" >
          <tr>
            <td width="8%" height="26" class="STYLE1"><div align="center" class="STYLE2 STYLE1">项目类型</div></td>
            <td width="14%" class="STYLE1"><div align="center" class="STYLE2 STYLE1">所属分公司</div></td>
            <td width="23%" height="26"  class="STYLE1"><div align="center" class="STYLE2 STYLE1">科技成果数量</div></td>
            <td width="21%"  class="STYLE1"><div align="center"><span class="STYLE2 STYLE1">科技成果所占比例</span></div></td>
            
            </tr>
            
             <%  if(wanted.length!=0){
              for(int i=wanted.length-1;i>=0;i--){
                float s = 0;
                int j = wanted[i];
                String x = comp.get(i);
                if(q!=0)
                 s = j/q; 
           %>
          <tr>
            <td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1"><%= typedefine%></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%=x %></div></td>
            <td height="18" bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%=j %></div></td>
            <td bgcolor="#FFFFFF"><div align="center" class="STYLE2 STYLE1"><%=s %></div></td>
            
            </tr>
            
             <%} }%>
        </table>
</body>

</html>
