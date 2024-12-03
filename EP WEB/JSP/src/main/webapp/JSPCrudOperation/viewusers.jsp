<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.jspdemo.models.User, com.jspdemo.daoimpl.UserDAO" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table, th, td {  
  		border: 1px solid black;  
  		border-collapse: collapse;  
  		font-family: arial;
  		font-size: 20px;
	}  
	th, td {  
  		padding: 10px;  
	}  
	table#alter tr:nth-child(even) {  
  		background-color: #eee;  
	}  
	table#alter tr:nth-child(odd) {  
  		background-color: #fff;  
	}  
	table#alter th {  
  		color: white;  
  		background-color: gray;  
	}  
	.hlink {
		background-color: white;
        color: green;
        padding: 5px 10px;
        text-align: center;
        display: inline-table;
        font-size: 20px;
        margin: 10px 30px;
        cursor: pointer;
        text-decoration:none;	
	}
}
</style>
</head>
<body>
	<h1>Users List</h1>  
  
<%  
	List<User> list=UserDAO.getAllRecords();  
	request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%" id="alter">  
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Password</th>
		<th>Email</th>  
		<th>Sex</th>
		<th>Country</th>
		<th>Operation</th>
		<th>Operation</th>
	</tr>  
	<c:forEach items="${list}" var="u">  
		<tr>
			<td>${u.getId()}</td>
			<td>${u.getName()}</td>
			<td>*********</td>  
			<td>${u.getEmail()}</td>
			<td>${u.getSex()}</td>
			<td>${u.getCountry()}</td>  
			<td>
				<a href="editform.jsp?id=${u.getId()}">Edit</a>
			</td>  
			<td>
				<a href="deleteuser.jsp?id=${u.getId()}">Delete</a>
			</td>
		</tr>  
	</c:forEach>  
</table>  
<br/>
<a href="adduserform.jsp">Add New User</a>    
</body>
</html>