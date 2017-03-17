<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/common/base.jsp" %>
<title>Insert title here</title>
<script type="text/javascript">
	
	$(function(){
		
// 		$("username").focusout(function(){
// 			var username = $(this).val();
// 			var regex = "/^[a-z0-9_-]{3,16}$/";
// 			if(!regex.match(username)){
// 				console.log("用户名格式错误！");
// 			}
// 		})
		
	})
	
</script>
</head>
<body>
	
	<%@ include file="/common/guest_top.jsp" %>
	
	<div id="mainDiv" class="borderDiv">
		
		[用户注册]
		<form action="user/register" method="post">
			<table class="formTable">
				<c:if test="${!empty exception.message }">
					<tr>
						<td colspan="2" style="color: red">
							${exception.message }
						</td>
					</tr>
				</c:if>
				<tr>
					<td>用户名</td>
					<td>
						<input id="username" class="longInput" type="text" name="username" placeholder="请输入用户名">
					</td>
				</tr>
				<tr>
					<td>密码</td>
					<td>
						<input id="password" class="longInput"  type="password" name="password" placeholder="请输入密码">
					</td>
				</tr>
				<tr>
					<td>确认密码</td>
					<td>
						<input id="confirmPassword" class="longInput"  type="password" name="confirmPassword" placeholder="请再次输入密码">
					</td>
				</tr>
				<tr>
					<td>性质</td>
					<td>
						<select name="role">
							<option value="0" label="普通用户">
							<option value="1" label="公司用户">
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="注册">
					</td>
				</tr>
			</table>
		</form>
		
	</div>
	
	<%@ include file="/common/guest_bottom.jsp" %>
</body>
</html>