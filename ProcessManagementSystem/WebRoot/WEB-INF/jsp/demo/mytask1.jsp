<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JbpmDemo</title>
	</head>
	<body>
		<form id="form1" name="form1" method="post" action="checkAction.do">
			<table width="200" border="1">
				<tr>
					<td><%=request.getSession().getAttribute("content")%></td>
					<input type="hidden" name=""
						value="<%=request.getSession().getAttribute("content")%>">
					<input type="hidden" name="processid"
						value="<%=request.getSession().getAttribute("processid")%>">
					<input type="hidden" name="taskid"
						value="<%=request.getSession().getAttribute("taskid")%>">
				</tr>
				<tr>
					<td>
						<label>
							<input type="submit" name="button" id="button" value="pass" />
						</label>
						<label>
							<input type="submit" name="button" id="button2" value="reject" />
						</label>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>