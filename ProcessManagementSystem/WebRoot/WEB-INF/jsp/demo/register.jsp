<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/struts_taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%-- 国际化--%>
	<title><bean:message key="register_page" />
	</title>
	<script type="text/javascript">
		//检查用户名为null,或者空字符串时,给出提示.
		function checkRegister(){
		var username = document.forms[0].username.value;
		if (username == null || username == ""){
		var message = '用户名不能为空!';
		alert(message);
		return false;
		}
		return true;
		}
	</script>
</head>
<body>
	<html:form action="register.do" method="post" focus="username">
		<bean:message key="username" />
		<html:text property="username" />
		<bean:message key="password" />
		<html:password property="password" />
		<html:submit onclick="return checkRegister();"></html:submit>
	</html:form>
</body>
</html:html>