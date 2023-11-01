<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>get</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  </head>
  <body>
  	<div class='container'>
  		<div class='jumbotron'>
			<h1>GET 방식 요청</h1>
		</div>
  		<ul class='list-group'>
			<li class='list-group-item'><h4>By Link</h4></li>
			<li class='list-group-item'><a href="<%=contextPath %>/getParams?job=insert&pageNo=10&searchWord=company">get link</a></li>
			
			<li class='list-group-item'><h4>By Button & JavaScript</h4></li>
			<li class='list-group-item'><button id="btnSendGet" class='btn btn-light'>Get 전송</button></li>
  		</ul>
  	</div>
    <script>
    
    $(document).ready(function() {
        $("#btnSendGet").click(function() {
          let job = "insert"
          let pageNo = "10"
          let searchWord = "company"
       	  let params = "?job="+job+"&pageNo="+pageNo+"&searchWord="+searchWord
          // let params = `?job=${job}&pageNo=${pageNo}&searchWord=${searchWord}`
          window.location.href = "<%=contextPath %>/getParams" + params
        });

    }); 
    
  
    </script>
  </body>
</html>
