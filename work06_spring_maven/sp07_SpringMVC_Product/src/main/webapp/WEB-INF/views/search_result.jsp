<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		width : 100%;
		border: 1px solid gray;
		border-collapse: collapse;
	}
	th, td {
		text-align : center;
		border: 1px solid gray;
		padding: 10px;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<th>ID</th>
			<th>name</th>
			<th>maker</th>
			<th>price</th>
		</thead>
		<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.maker}</td>
				<td>${item.price}</td>
			</tr>		
		</c:forEach>
	</table>
</body>
</html>