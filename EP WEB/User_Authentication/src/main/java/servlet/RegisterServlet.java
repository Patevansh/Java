package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Register1", urlPatterns = { "/Register1" })
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/EP?useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "vansh";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        boolean isRegistered = registerUser(username, password, email);

        out.println("<html><body>");
        if (isRegistered) {
            out.println("<h2>Registration successful!</h2>");
            out.println("<p>Welcome, " + username + ".</p>");
        } else {
            out.println("<h2>Registration failed!</h2>");
            out.println("<p>Please try again.</p>");
        }
        out.println("</body></html>");
    }

    private boolean registerUser(String username, String password, String email) {
        boolean isRegistered = false;
        try {
  
        	Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

            String sql = "INSERT INTO users VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, email);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                isRegistered = true;
            }

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isRegistered;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
        response.sendRedirect("loginform.html");
    }
}
