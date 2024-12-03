<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.jspdemo.daoimpl.UserDAO"%>  

<jsp:useBean id="user" class="com.jspdemo.models.User"></jsp:useBean>  
<jsp:setProperty name="user" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%  
		int result = UserDAO.save(user);  
		if(result>0){  
			response.sendRedirect("adduser-success.jsp");  
		}else{  
			response.sendRedirect("adduser-error.jsp");  
		}  
	%>  
</body>
</html>