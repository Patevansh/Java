<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
    <h2>Edit Student</h2>
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        String name = "";
        int age = 0;
        String email = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EP?useSSL=false", "root", "vansh");
            String sql = "SELECT * FROM Students WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                name = rs.getString("Name");
                age = rs.getInt("Age");
                email = rs.getString("Email");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <form action="UpdateServlet" method="post">
        <input type="hidden" name="id" value="<%= id %>">
        Name: <input type="text" name="name" value="<%= name %>" required><br>
        Age: <input type="number" name="age" value="<%= age %>" required><br>
        Email: <input type="email" name="email" value="<%= email %>" required><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
