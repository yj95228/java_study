<%@page import="servlet.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
User vo = (User)session.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>	
		* {
			text-align: center;
		}
		p {
			margin-top: 30px;
			margin-bottom: 50px;
		}
		a {
			display: block;
			line-height: 2;
		}
	</style>
</head>
<body>	
<hr>
<h2><p><%=vo.getName() %> 님이 로그인 되었습니다.!!!</p></h2>
<a href="book/Book.html">도서 등록</a>
<a href="logout.jsp">로그 아웃</a>
</body>
</html>