<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>1. JSP 기본 Element로 값 받아오기</h1>
<p>REQUEST에 바인딩된 값: <%= request.getAttribute("RESULT1") %></p>
<p>SESSION에 바인딩된 값: <%= session.getAttribute("RESULT2") %></p>
<hr>
<h1>2. JSP EL로 값 받아오기</h1>
<p>REQUEST에 바인딩된 값: ${RESULT1}</p>
<p>SESSION에 바인딩된 값: ${RESULT2}</p>
<!-- request 먼저 찾고 못 찾으면 session에서 찾음 -->
</body>
</html>