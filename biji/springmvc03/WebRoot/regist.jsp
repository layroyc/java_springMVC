<i><%@page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%> <%@taglib
		uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<html>
<head>
<title>regist</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath }/css/style.css" /> --%>
</head>

<body>
	<h1>regist</h1>
	<form action="/springmvc03/regist2" method="post">
		用户名:<input type="text" name="username"><br>
		密码:<input type="password" name="password"><br>
		 <input type="submit" value="注册 ">
	</form>
</body>
	</html>