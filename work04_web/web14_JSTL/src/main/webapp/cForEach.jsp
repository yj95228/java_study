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
	<h1>forEach 반복문 사용하기</h1>
	<c:forEach begin="1" end="10" var="cnt">
		<p><font size="${cnt}}">Hello Friday</font></p>
	</c:forEach>
</body>
</html>