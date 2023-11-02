<%@page import="servlet.model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<Book> list = (ArrayList<Book>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1 align="center">전체 도서 List 보기</h1>
	<table class="table table-bordered">
	<% 
	for (Book book : list){ 
	%>
		<tr bgcolor="yellow">
			<td><%=book.getIsbn() %></td>
			<td><%=book.getTitle() %></td>
			<td><%=book.getCatalogue() %></td>
			<td><%=book.getNation() %></td>
			<td><%=book.getPublish_date() %></td>
			<td><%=book.getPublisher() %></td>
			<td><%=book.getAuthor() %></td>
			<td><%=book.getPrice() %></td>
			<td><%=book.getDescription() %></td>
		</tr>
	<% 
	}
	%>
	</table>
	<h3 align="center"><a href="Book.html">등록 화면으로</a></h3>
	<h3 align="center"><a href="../login.html">로그인 화면으로</a></h3>
</div>s
</body>
</html>