<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MemberVO vo =(MemberVO)session.getAttribute("vo");
	String pbook = (String)session.getAttribute("pbook");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Information...</h2>
Login ID : <%=vo.getId() %><br>
Login Pass : <%=vo.getPassword() %><br>
Product Name : <%=pbook %><br>
</body>
</html>