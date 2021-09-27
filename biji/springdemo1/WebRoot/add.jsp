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
	<span>新增</span>
	<form action="/springdemo1/studentInfo/add" method="post">
		姓名：<input type="text" name="sname"><br> 
		年龄：<input type="text" name="sage"><br> 
		身份证：<input type="text" name="sidcard"><br> 
		电话：<input type="text" name="sphoneno"><br> 
		新增时间：<input type="text" name="addtime"><br> 
		性别：男<input type="radio" name="ssex">
			   女<input type="radio" name="ssex"><br> 
		<input type="submit" value="提交">
	</form>

</body>
</html>
