
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create Student</title>
</head>
<body>
    <h2>Create Student</h2>
    <form action="InsertServlet" method="post">
        Name: <input type="text" name="name" required><br>
        Age: <input type="number" name="age" required><br>
        Email: <input type="email" name="email" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
