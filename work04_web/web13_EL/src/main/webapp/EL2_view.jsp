<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Element vs EL</h1>
	<h2>1. JSP �⺻ Element ����ϱ�</h2>
	ID: <%= request.getParameter("myId") %>
	
	<hr>
	
	<h2>2. JSP EL ����ؼ� form�� �޾ƿ���</h2>
	ID: ${param.myId}
	
	<hr>
	
	<h2>3. JSP �⺻ Element ����ϱ�: checkbox</h21>
	<%
		String[] menus = request.getParameterValues("menu");
		for(String menu: menus){
	%>
		<p><%= menu %></p>
	<%
		}
	%>
	
	<hr>
	
	<h2>4. JSP EL ����ϱ�: checkbox</h2>
	<p>${paramValues.menu[0]}</p>
	<p>${paramValues.menu[1]}</p>
	<p>${paramValues.menu[2]}</p>
	<p>${paramValues.menu[3]}</p>
</body>
</html>