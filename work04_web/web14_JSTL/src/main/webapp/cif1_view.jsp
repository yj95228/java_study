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
	<c:if test="${param.NUM == '100'}">
		<p>100���� �Ա�Ȯ�� �Ϸ�</p>
	</c:if>
	<c:if test="${param.NUM == '200'}">
		<p>100���� �Ա�Ȯ�� �Ϸ�</p>
	</c:if>
</body>
</html>