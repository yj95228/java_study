<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
	<c:when test="${vo == null}">
		<h2><a href="login.jsp">로그인 하기</a></h2>
	</c:when>
	<c:otherwise>
		<% session.invalidate(); %>
	</c:otherwise>
</c:choose>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 onload = function() {
	alert("Log out~~!!");
}
</script>
</head>
<body>
<b>로그아웃 되셨습니다..</b>
<br>
<a href="index.jsp">INDEX Page</a>
</body>
</html>