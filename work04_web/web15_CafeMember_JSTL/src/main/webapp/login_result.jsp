<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Information...</h2>
ID :   ${vo.id}<BR>
NAME :   ${vo.name}<BR>
ADDRESS :   ${vo.address}<BR><br><BR><br>
<hr>
<a href="logout.jsp">Log OUT</a>
<a href="index.jsp">INDEX Page</a>
</body>
</html>