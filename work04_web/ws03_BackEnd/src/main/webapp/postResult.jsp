<%@page import="web.servlet.dto.ParameterDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ParameterDto pdo = (ParameterDto) request.getAttribute("pdo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class='container'>
		<div class='jumbotron'>
			<h1>Post Result</h1>
		</div>
		<table class='table'>
			<tr>
				<td>name</td>
				<td><%= pdo.getName()%></td>
			</tr>
			<tr>
				<td>email</td>
				<td><%= pdo.getEmail()%></td>
			</tr>
			<tr>
				<td>gender</td>
				<td><%= pdo.getGender()%></td>
			</tr>
			<tr>
				<td>hobby</td>
				<td><%= String.join(", ", pdo.getHobby())%></td>
			</tr>
			<tr>
				<td>favorite</td>
				<td><%= pdo.getFavorite()%></td>
			</tr>
			<tr>
				<td>desc</td>
				<td><%= pdo.getDesc()%></td>
			</tr>
		</table>
	</div>
</body>
</html>