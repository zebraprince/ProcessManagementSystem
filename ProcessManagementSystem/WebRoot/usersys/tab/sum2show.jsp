<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page contentType = " text/html; charset=GBK" %> 

<%@page import = " java.io.FileNotFoundException " %> 
<%@page import = " java.io.FileOutputStream " %> 

<%@page import = " java.io.IOException " %> 


<%@page import = " org.jfree.chart.ChartFactory " %> 
<%@page import = " org.jfree.chart.ChartUtilities " %> 
<%@page import = " org.jfree.chart.JFreeChart " %> 
<%@page import = " org.jfree.chart.plot.PlotOrientation " %> 
<%@page import = " org.jfree.data.category.CategoryDataset " %> 
<%@page import = " org.jfree.data.category.DefaultCategoryDataset " %> 

<%@page import = " java.awt.Color " %> 
<%@page import = " org.jfree.chart.renderer.category.BarRenderer3D " %> 
<%@page import = " org.jfree.chart.labels.StandardCategoryItemLabelGenerator " %> 
<%@page import = " org.jfree.chart.axis.CategoryAxis " %> 
<%@page import = " org.jfree.chart.plot.CategoryPlot " %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
int []wanted = (int[])session.getAttribute("wanted");
List<String> comp = (List<String>)session.getAttribute("comp");
String udate = (String)session.getAttribute("udate");
String uedate = (String)session.getAttribute("uedate");
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

window.resizeTo(800,600);
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
        <td width="1101" background="images/tab_05.gif">&nbsp;</td>
        <td width="281" background="images/tab_05.gif"><table border="0" align="right" cellpadding="0" cellspacing="0">
            <tr>
              <td width="60"><table width="87%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1">&nbsp;</td>
                    <td class="STYLE1">&nbsp;</td>
                  </tr>
              </table></td>
              <td width="60">&nbsp;</td>
              <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1">&nbsp;</td>
                    <td class="STYLE1">&nbsp;</td>
                  </tr>
              </table></td>
              <td width="52"><table width="88%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"></div></td>
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
        <td bgcolor="#f3ffe3"><table width="99%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#c0de98" >
          <tr>
            <td width="86%" height="18" valign="top" bgcolor="#FFFFFF"><p>&nbsp;</p>
              <p>&nbsp;</p>
              <p>&nbsp;</p>
              <p>&nbsp;</p>
              <table width="970" height="589" border="0">
                <tr>
                  <td width="709" height="375"><% 
  DefaultCategoryDataset dataset     =   new  DefaultCategoryDataset();
  dataset.addValue( wanted[0] ,  " 分公司A " ,"分公司A");
  dataset.addValue( wanted[1] ,  " 分公司B " ,"分公司B");
  dataset.addValue( wanted[2] ,  " 分公司C ","分公司C");
 
  
    JFreeChart chart  =  ChartFactory.createBarChart3D( " 科技项目柱状图" , "分公司" , " 合同数量 " ,dataset,PlotOrientation.VERTICAL, true , false , false );
        chart.setBackgroundPaint(Color.WHITE);
        CategoryPlot plot  =  chart.getCategoryPlot();

        CategoryAxis domainAxis  =  plot.getDomainAxis();
         // domainAxis.setVerticalCategoryLabels( false );
        plot.setDomainAxis(domainAxis);

        BarRenderer3D renderer  =   new  BarRenderer3D();
        renderer.setBaseOutlinePaint(Color.BLACK);

         // 设置每个地区所包含的平行柱的之间距离
        renderer.setItemMargin( 0.1 );
         // 显示每个柱的数值，并修改该数值的字体属性
        renderer.setItemLabelGenerator( new  StandardCategoryItemLabelGenerator());
        renderer.setItemLabelsVisible( true );
        plot.setRenderer(renderer);

         //  设置柱的透明度
        plot.setForegroundAlpha(0.8f);

    ChartUtilities.writeChartAsJPEG(response.getOutputStream(),chart, 450 , 400 );
%> 
            
    </td>
                  <td width="251">&nbsp;</td>
                </tr>
                <tr>
                  <td height="94">&nbsp;</td>
                  <td><span class="STYLE9">返回</span></td>
                </tr>
              </table>              <p align="center" class="STYLE8">&nbsp;</p>
              </td>
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
            <td width="25%" height="29" nowrap="nowrap">&nbsp;</td>
            <td width="75%" valign="top" class="STYLE1">&nbsp;</td>
          </tr>
        </table></td>
        <td width="14"><img src="images/tab_22.gif" width="14" height="29" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>        
   