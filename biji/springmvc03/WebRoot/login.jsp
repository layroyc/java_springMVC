<i><%@page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%> <%@taglib
		uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<html>
<head>
<title>login</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath }/css/style.css" /> --%>
</head>

<body>
	<h1>login</h1>
	<form action="/springmvc02/login" method="post">
		username:<input type="text" name="username"><br>
		password:<input type="password" name="password"><br> <input
			type="submit" value="登录 ">
	</form>
</body>
	</html> </i>