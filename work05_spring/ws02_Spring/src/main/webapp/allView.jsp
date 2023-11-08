<%@page import="servlet.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th class="text-center">ID</th>
			<th class="text-center">NAME</th>
			<th class="text-center">ADDRESS</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="vo">
	    	<tr>
	    		<td class="text-center">${vo.id}</td>
	    		<td class="text-center">${vo.name}</td>
	    		<td class="text-center">${vo.address}</td>
	    	</tr>
		</c:forEach>
    </tbody>
</table>
<h3 align="center"><a href="index.jsp">HOME...</a></h3>

</div>
</body>
</html>


















