<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<div class="jumbotron jumbotron-fluid">
  <div class="container">  
	<h1> DB연동으로 Cafe Member Using FrontControllerPattern</h1>	
  </div>
</div>

<div class="container">
	<h3><a href="find.jsp">회원 검색 하기</a></h3>
	<c:choose>
		<c:when test="${!empty vo}">
			<h3><a href="front.do?command=showAll">전체 회원 보기</a></h3>
			<h3><a href="front.do?command=logout">로그 아웃</a></h3>
			<h3><a href="front.do?command=update">회원정보 수정</a></h3>
		</c:when>
		<c:otherwise>
			<h3><a href="register.jsp">회원 가입 하기</a></h3>
			<h3><a href="login.jsp">로그인 하기</a></h3>
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>