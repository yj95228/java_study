<%@page import="servlet.model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Book book = (Book)request.getAttribute("book");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2>결과 페이지</h2>
	<span><p style="color:orange"><%=book.getTitle() %></p>
	<p> 정상적으로 저장 되었습니다.</p>
	</span>
	</span><a href="Book.html">추가 등록</a>
	<a href="AllBook">도서 목록</a>
</div>
</body>
</html>