
<%@page import="com.service.spring.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2>  회원 조회 결과 </h2>
<h4>${msg}</h4>
<hr>
ID : ${vo.id}<br>
NAME: ${vo.name}<br>
ADDRESS: ${vo.address}<br>
</body>
</html>












