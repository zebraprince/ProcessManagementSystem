
<!-- 标示JSP页面类型和指定编码 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" autoFlush="false" errorPage="exception.jsp"%>
<!-- errorPage="error.jsp" -->
<!-- <%@include file="read.txt"%>-->

<!-- 文类型档类型声明 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%--JSP的9个内置对象--%>
		<!-- JSP:forward,转发的目标地：HTML、JSP、Servlet -->
		<%-- 注释jsp:forward, 
		<jsp:forward page="target.jsp">
			<jsp:param name="username"
				value='<%=request.getParameter("username")%>' />
		</jsp:forward> 
		-->
		<%-- JSP的注释,在客户端是不会被看到的--%>
		<%
			for (int i = 0; i < 2; i++) {
		%>
		<%-- 输出10个HR--%>
		<hr>
		<%
			}
		%>


		<%-- 以下定义的是一个全部变量,因为JSP被编译成Servlet,而servlet全局只有一个--%>
		<%-- jsp中的方法只能定义在带!的范围内--%>
		<%!
			int count = 1;
	
			public void count() {
				count++;
			}
		%>
		<%
			count();
			out.println("count值=" + count);
		%>

		<%-- JSP表达式--%>
		<%=count%>


		<%-- JSP脚本,下面的例子,输出一个表格--%>
		<table>
			<%
				for (int i = 0; i < 10; i++) {
			%>
			<!-- 以下的为JSP脚本 -->
			<tr>
				<%
					for (int j = 0; j < 10; j++) {
				%>

				<td>
					<%=j%>
				</td>
				<%
					}
				%>
			</tr>
			<%
				}
			%>
		</table>

		<!-- 9个内置对象 -->
		<%request.getParameter("username");%>
		<%response.getOutputStream(); %>
		<%out.print("b"); %>
		<%application.getInitParameterNames();%>
		<%-- 三个编译指令,page(当前页面的),include,taglib--%><%--page指令--%>
		<%-- JSP的7个动作指令,JSP:forward,JSP:param,JSP:include,JSP:Plugin,JSP:useBean,JSP:setProperty,JSP:getProperty--%>
		<%-- JSP的9个?--%>


		<!-- 分析forward以及redirect的区别

从第二部分的“forward以及redirect的执行过程以及结果”可以看出forward以及redirect至少有两个区别：
其一、forward（requestForForward）可以把index.jsp中的问号以及表单中的参数传到forward的目标页面（redirectOrForward.jsp），但是redirect不行；
其二、forward的时候，请求的地址（点击requestForForward.jsp 中链接URL）就是最终显示在浏览器地址栏中的URL，而redirect时，请求的地址与最终显示在浏览器地址栏中的URL一般不一样，而且后者以redirect时的参数（地址）为准。

基于以上做一个简单的分析或者说推测：
1、forward是你所请求的URL所在服务器，把你的请求封装成流传给forward到的目标页面（其中含有以及基本信息以及参数等），而redirect相当于你首先向你所请求的URL申请，然后此URL给你一个新的URL，你再向此新URL再来一次新的请求，所以浏览器地址栏会变，而且接受不到原先传的参数（index.jsp中传的）  -->

	</body>
</html>