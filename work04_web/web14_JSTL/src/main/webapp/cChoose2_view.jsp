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
	<h1>c:Choose ����ϱ� - �������� ���</h1>
	<c:choose>
		<c:when test="${param.NUM == '100'}">
			<p>100���� �Ա� Ȯ�� �Ϸ�</p>
		</c:when>
		<c:when test="${param.NUM == '200'}">
			<p>200���� �Ա� Ȯ�� �Ϸ�</p>
		</c:when>
		<c:otherwise>
			<p>�Աݾ��� �ٽ� Ȯ�����ֽñ� �ٶ��ϴ�</p>
		</c:otherwise>
	</c:choose>
</body>
</html>