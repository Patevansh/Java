package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/EP?useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "vansh";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isAuthenticated = authenticateUser(username, password);

        out.println("<html><body>");
        if (isAuthenticated) {
            out.println("<h2>Login successful!</h2>");
            out.println("<p>Welcome, " + username + ".</p>");
        } else {
            out.println("<h2>Login failed!</h2>");
            out.println("<p>Invalid username or password.</p>");
        }
        out.println("</body></html>");
    }

    private boolean authenticateUser(String username, String password) {
        boolean isAuthenticated = false;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

            String sql = "SELECT username, password FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet!=null) {
                isAuthenticated = true;
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAuthenticated;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        response.sendRedirect("loginform.html");
    }
}
