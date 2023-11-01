<%@page import="servlet.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberVO> list = (ArrayList<MemberVO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron text-center">
			<h1>전체 회원 명단 보기</h1>
		</div>
		<table class='table table-hover text-center'>
			<thead class='thead-dark'>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Address</th>
				</tr>
			</thead>
			<tbody>
			<%
				for(MemberVO vo: list){
					
			%>
			<tr>
				<td><%= vo.getId() %></td>
				<td><%= vo.getName() %></td>
				<td><%= vo.getAddress() %></td>
			</tr>
			<%
				}
			%>
			</tbody>
		</table>
		<div class='text-center'>
			<h5><a href="index.html">Home</a></h5>
		</div>
	</div>
</body>
</html>