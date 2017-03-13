<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
	<jsp:include page="../common/MainMenu.jsp"></jsp:include>
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
				<button id="login" name="Login">Login</button>
			</td>
		</tr>
	</table>
</body>
</html>