<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"; 
	System.out.println(basePath);
	pageContext.setAttribute("basePath", basePath);
%>

<%-- <base href="<%=basePath%>"> --%>

