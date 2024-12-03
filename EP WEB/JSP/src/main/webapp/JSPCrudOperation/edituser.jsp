<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.jspdemo.daoimpl.UserDAO"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" 
		class="com.jspdemo.models.User">
	</jsp:useBean>  
	<jsp:setProperty property="*" name="user"/>  
	<%  
		int i = UserDAO.update(user);  
		response.sendRedirect("viewusers.jsp");  
	%>  
</body>
</html>