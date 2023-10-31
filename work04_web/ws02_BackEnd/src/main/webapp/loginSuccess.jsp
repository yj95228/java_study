<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><%= request.getAttribute("userId") %>님이 로그인하셨습니다</h1>
<button>도서등록</button>
<button>로그아웃</button>
</body>
</html>