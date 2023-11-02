<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVO vo = (MemberVO)session.getAttribute("vo");
    if(vo==null){ //로그인된 상태가 아니라면...
%>
	<h2><a href="login.jsp">로그인 하기</a></h2>
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
	alert("Log out~~!!");
}
</script>
</head>
<body>
<b>로그아웃 되셨습니다..</b>
<br>
<a href="index.html">INDEX Page</a>
</body>
</html>