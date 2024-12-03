<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            
            <th>Name</th>
            <th>Age</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
        <%
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EP?useSSL=false", "root", "vansh");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Students");
                while (rs.next()) {
        %>
        <tr>
            
            <td><%= rs.getString("Name") %></td>
            <td><%= rs.getInt("Age") %></td>
            <td><%= rs.getString("Email") %></td>
            <td>
                <a href="edit.jsp?id=<%= rs.getInt("ID") %>">Edit</a>
                <a href="DeleteServlet?id=<%= rs.getInt("ID") %>">Delete</a>
            </td>
        </tr>
        <%
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </table>
</body>
</html>
