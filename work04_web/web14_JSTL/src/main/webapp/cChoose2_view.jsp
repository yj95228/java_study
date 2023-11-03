<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>c:Choose 사용하기 - 양자택일 제어문</h1>
	<c:choose>
		<c:when test="${param.NUM == '100'}">
			<p>100만원 입금 확인 완료</p>
		</c:when>
		<c:when test="${param.NUM == '200'}">
			<p>200만원 입금 확인 완료</p>
		</c:when>
		<c:otherwise>
			<p>입금액을 다시 확인해주시기 바랍니다</p>
		</c:otherwise>
	</c:choose>
</body>
</html>