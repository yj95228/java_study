<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping3-1.css">
</head>
<body>
<div align="center" class="body">
	<h2>전체 상품 목록</h2>
	<table border="1">
		<tr class="header">
			<th align="center" width="80">상품 ID</th>
			<th align="center" width="320">상품명</th>
			<th align="center" width="100">가격</th>
		</tr>
		<!-- JSTL 반복문 -->
		<c:forEach items="${list}" var="item">
			<tr class="record">
				<td align="center">${item.itemNumber}</td>
				<td align="center"><a href="detail.do?itemnumber=${item.itemNumber}">${item.name}</a></td>
				<td align="center">${item.price}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>



