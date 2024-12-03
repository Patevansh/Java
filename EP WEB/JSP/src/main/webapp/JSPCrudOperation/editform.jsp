<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jspdemo.models.User, com.jspdemo.daoimpl.UserDAO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body {font-family: Arial, Helvetica, sans-serif;}
	* {box-sizing: border-box;}
	
	input[type=text], input[type=password], select {
	  width: 100%;
	  padding: 10px;
	  border: 1px solid #ccc;
	  border-radius: 2px;
	  box-sizing: border-box;
	  margin-top: 6px;
	  margin-bottom: 16px;
	  resize: vertical;
	}
	
	input[type=submit] {
	  background-color: #04AA6D;
	  color: white;
	  padding: 12px 20px;
	  border: none;
	  border-radius: 4px;
	  cursor: pointer;
	}
	
	input[type=submit]:hover {
	  background-color: #45a049;
	}
	
	.container {
	  border-radius: 5px;
	  background-color: #f2f2f2;
	  padding: 20px;
	}
</style>
</head>
<body>
  
	<%  
		String id=request.getParameter("id");  
		User user = UserDAO.getRecordById(Integer.parseInt(id));  
	%>  
	<h1>Edit Form</h1>  
	<form action="edituser.jsp" method="post">  
		<input type="hidden" name="id" value="<%=user.getId() %>"/>  
		<table>  
			<tr>
				<td>Name:</td>
				<td>  
					<input type="text" name="name" 
						value="<%= user.getName()%>"/>
				</td>
			</tr>  
			<tr>
				<td>Password:</td>
				<td>  
					<input type="password" name="password" 
						value="<%= user.getPassword()%>"/>
				</td>
			</tr>  
			<tr>
				<td>Email:</td>
				<td>  
					<input type="email" name="email" 
						value="<%= user.getEmail()%>"/>
				</td>
			</tr>  
			<tr>
				<td>Sex:</td>
				<td>  
					<input type="radio" name="sex" value="male"/>Male   
					<input type="radio" name="sex" value="female"/>Female 
				</td>
			</tr>  
			<tr>
				<td>Country:</td>
				<td>  
					<select name="country" style="width:155px">  
						<option>India</option>  
						<option>Canada</option>  
						<option>Australlia</option>  
						<option>UK</option>  
						<option>USA</option>  
					</select>  
				</td>
			</tr>  
			<tr>
				<td colspan="2">
					<input type="submit" value="Edit User"/>
				</td>
			</tr>  
		</table>  
	</form>  
</body>
</html>