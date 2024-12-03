
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Myservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    String url = "jdbc:mysql://localhost:3306/abc";
    String user = "root";
    String password = "vansh";
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM employee";
            pstmt = connection.prepareStatement(sql);
            resultSet = pstmt.executeQuery();
            out.println("<html><body>");
            while (resultSet.next()) {
                String empName = resultSet.getString("empName");
                int Deptno = resultSet.getInt("Deptno");
                int empId=resultSet.getInt("empId");
                out.println(empId + " " +empName + " " +Deptno + " ");
                out.println("<br>");
            } 
            out.println("</body></html>");
        } catch (Exception e) {
            out.println("<html><body><h2>Error: " + e.getMessage() + "</h2></body></html>");
        }
    }
}