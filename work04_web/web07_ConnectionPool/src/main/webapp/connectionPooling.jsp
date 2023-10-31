<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>ConnectionPooling Test - Using JNDI Service</h2>
<%
	Context ic = new InitialContext();
	DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/oracleDB");
	out.println("<b>1. DataSource Lookup</b>");
	Connection conn = ds.getConnection();
	out.println("<br><b>2. Connection Rent Success</b>");
%>
</body>
</html>