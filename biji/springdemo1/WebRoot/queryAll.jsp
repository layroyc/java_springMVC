<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>queryAll</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<form action="/springdemo1/studentInfo/queryAll" method="post">
			<a href="/springdemo1/studentInfo/add">新增</a>&nbsp;
			<table class="table" style="text-align:center;">
				<tr>
					<th>姓名</th>
					<th>年龄</th>
					<th>身份证号</th>
					<th>手机号</th>
					<th>创建时间</th>
					<th>性别</th>
					<th>操作</th>
				</tr>
				<tr>
					<td><input type="text" name="sname"></td>
					<td><input type="text" name="sage"></td>
					<td><input type="text" name="sidcard"></td>
					<td><input type="text" name="sphoneno"></td>
					<td><input type="text" name="addtime"></td>
					<td><input type="text" name="ssex"></td>
					<td><a href="/springdemo1/studentInfo/delete">删除</a></td>
				</tr>
			</table>
		</form>
	</body>
</html>
