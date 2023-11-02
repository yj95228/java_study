<%@page import="servlet.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	User vo = (User)session.getAttribute("vo");
	if(vo==null){
%>
<h2><a href="login.html">로그인 하기</a></h2>		
<%
	}else{
		session.invalidate();
	}
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
onload = function() {
	alert("정상적으로 로그아웃 되었습니다.");
	var link = "login.html";
	location.href=link;
}
</script>
</head>
<body>
</body>
</html>