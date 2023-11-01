<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>post</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
	$(document).ready(function() {
		$("#btnSendPost").click(function() {
			let form = document.querySelector("form");
			form.action = "<%=contextPath %>/postParams";
			form.method = "post";
			form.submit();
		});

	});
</script>
  </head>
  <body>
	<div class='container'>
	    <form action="">
		    <div class='jumbotron'>
				<h1>기본 정보</h1>
			</div>
			<table class='table'>
				<tr>
					<td><label for="name">이름</label></td>
					<td><input id="name" name="name" type="text"/></td>
				</tr>
				
				<tr>
					<td><label for="email">e-mail</label></td>
					<td><input id="email" name="email" type="email"/></td>
				</tr>
				
				<tr>
					<td><label for="gender">성별</label></td>
					<td>
						<input id="male" type="radio" name="gender" value="M"><label for="male">남</label>
						<input id="female" type="radio" name="gender" value="F" checked><label for="female">여</label>
					</td>
				</tr>
				
				<tr>
					<td><label for="hobby">취미</label></td>
					<td>
						<input id="movie" type="checkbox" name="hobby" value="movie">
						<label for="movie">영화</label>        
						<input id="sport" type="checkbox" name="hobby" value="sport" checked>
						<label for="sport">스포츠</label>
						<input id="music" type="checkbox" name="hobby" value="music">
						<label for="music">음악</label>
					</td>
				</tr>
				
				<tr>
					<td><label for="favorite">선호하는 재테크</label></td>
					<td>
						<select name="favorite" id="favorite">
						    <option value="SV">저축</option>
						    <option value="ST" selected>주식</option>
						    <option value="PS">연금</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td><label for="desc">기타</label></td>
					<td><textarea name="desc" id="desc" cols="30" rows="5"></textarea></td>
				</tr>
			</table>
	    </form>
	
	    <hr>
	    <button id="btnSendPost" class='btn btn-primary'>Post 전송</button>
	</div>
  </body>
</html>
