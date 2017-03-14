<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../common/MainMenu.jsp"></jsp:include>
<title>登陆</title>
<script type="text/javascript">
	$(function(){
		
		var aa = "aaa";
		console.log(aa);
		
		$("#login").click(function(){
			
			var username = $("#username").val();
			var password = $("#password").val();
// 			var basePath = ${basrPath};
// 			conlose.log(basePath)
// 			$.ajax({
// 				type:"POST",
// 				url: "${basePath}user/login",			
// 				data: "username="+username+"&password="+password,
// 				success: function(msg){
// 					alert(msg)
// 				}
// 			});
			console.log(username + "-" + password);
		});
		
	});
</script>
</head>
<body>
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