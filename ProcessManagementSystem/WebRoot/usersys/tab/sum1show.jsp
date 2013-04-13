<%@ page contentType="text/html;charset=GBK"%>
<%@ page import="org.jfree.data.general.DefaultPieDataset"%>
<%@ page import="org.jfree.chart.*"%>
<%@ page import="org.jfree.chart.plot.*"%>
<%@ page import="org.jfree.chart.servlet.ServletUtilities"%>
<%@ page import="org.jfree.chart.labels.StandardPieToolTipGenerator"%>
<%@ page import="org.jfree.chart.urls.StandardPieURLGenerator"%>
<%@ page import="org.jfree.chart.entity.StandardEntityCollection"%>
<%@ page import="java.io.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
int []wanted = (int[])session.getAttribute("wanted");
List<String> comp = (List<String>)session.getAttribute("comp");
String typedefine = (String)session.getAttribute("typedefine");
int q = Integer.parseInt((String)session.getAttribute("q"));
%>

<%
            DefaultPieDataset data = new DefaultPieDataset(); 
             
            
            //数据初始化
            data.setValue("分公司A",wanted[0]); 
            data.setValue("分公司B",wanted[1]); 
            data.setValue("分公司C",wanted[2]); 
           
            
            //HttpSession session = request.getSession();

            PiePlot3D plot = new PiePlot3D(data);//生成一个3D饼图 
            //plot.setURLGenerator(new StandardPieURLGenerator("DegreedView.jsp"));//设定图片链接 
            JFreeChart chart = new JFreeChart("",JFreeChart.DEFAULT_TITLE_FONT, plot, true); 
            chart.setBackgroundPaint(java.awt.Color.white);//可选，设置图片背景色 
            chart.setTitle("科技项目成果饼状图");//可选，设置图片标题 
            plot.setToolTipGenerator(new StandardPieToolTipGenerator()); 
            StandardEntityCollection sec = new StandardEntityCollection(); 
            ChartRenderingInfo info = new ChartRenderingInfo(sec); 
             plot.setForegroundAlpha(0.8f);
            PrintWriter w = new PrintWriter(out);//输出MAP信息 
            ChartUtilities.writeChartAsJPEG(response.getOutputStream(),chart, 640 , 400 );
            
            %> 

