<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>1. JSP �⺻ Element�� �� �޾ƿ���</h1>
<p>REQUEST�� ���ε��� ��: <%= request.getAttribute("RESULT1") %></p>
<p>SESSION�� ���ε��� ��: <%= session.getAttribute("RESULT2") %></p>
<hr>
<h1>2. JSP EL�� �� �޾ƿ���</h1>
<p>REQUEST�� ���ε��� ��: ${RESULT1}</p>
<p>SESSION�� ���ε��� ��: ${RESULT2}</p>
<!-- request ���� ã�� �� ã���� session���� ã�� -->
</body>
</html>