<%@page import="web.servlet.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Member member = (Member) request.getAttribute("member"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%= request.getParameter("address") %>에 사는 멤버들입니다<br>
</head>
<body>
	이름 : <%= member.getName() %><br>
	나이 : <%= member.getAge() %><br>
</body>
</html>