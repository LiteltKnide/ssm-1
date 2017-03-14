<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/pages/common/MainMenu.jsp" %>
<title>登陆</title>
<script type="text/javascript">
	$(function(){
		
		var aa = "aaa";
		console.log(aa);
		
		
	});
</script>
</head>
<body>
	<form action="${basePath }user/login" method="post">
		<input type="hidden" name="token" value="${token }">
		<table width="20%" align="center" border="1">
			<tr>
				<td>Username</td>
				<td>
					<input id="username" type="text" name="username" >
				</td> 
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input id="password" type="password" name="password">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="Login">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>