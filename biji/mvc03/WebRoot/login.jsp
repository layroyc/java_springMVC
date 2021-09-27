<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<form action="/mvc03/paramuser" method="post">
		用户名：<input type="text" name="username"><br> 
		密码：<input type="password" name="password"><br> 
		<input type="submit" value="登录">
	</form>

	<hr>
	<form action="/mvc03/paramdate" method="post">
		生日：<input type="text" name="birthday"> <br>
		<input type="submit" value="登录">
	</form>

	<hr>
	<form action="/mvc03/paramlist" method="post">
		hobbys：
		<input type="checkbox" name="hobbys" value="singsong"> 唱歌
		<input type="checkbox" name="hobbys" value="dance"> 跳舞
		<input type="checkbox" name="hobbys" value="rap"> rap
		<input type="submit" value="提交">
	</form>
	
	<hr>
	<form action="/mvc03/paramlist2" method="post">
		用户名1：<input type="text" name="users[0].username"> 密码1：<input type="password" name="users[0].password"> <br>
		用户名2：<input type="text" name="users[1].username"> 密码2：<input type="password" name="users[1].password"><br> 
		<input type="submit" value="提交">
	</form>
</body>
</html>
