<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link href="WEB_INF/pages/common.jsp"> -->
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="WEB-INF/pages/common.jsp"></jsp:include>
	<h1>Hello World</h1>
	<p>${pageContext.request.contextPath }</p>
	<p>${pageContext.request.scheme }</p>
	<p>${pageContext.request.localPort }</p>
	<p>${pageContext.request.serverName }</p>
	<br>
	<a href="test/list">show the list</a>
</body>
</html>