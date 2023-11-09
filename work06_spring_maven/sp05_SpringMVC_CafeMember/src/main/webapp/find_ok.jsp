<%@page import="spring.service.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 검색 결과 </h2>
ID :  ${member.id} <BR>
NAME :   ${member.name}<BR>
ADDRESS :  ${member.address}
</body>
</html>