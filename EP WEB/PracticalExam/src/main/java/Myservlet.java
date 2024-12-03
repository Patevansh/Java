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


@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String url="jdbc:mysql://localhost:3306/abc";
	String user="root";
	String password="vansh";
    public Myservlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		PrintWriter out=response.getWriter();
		try {
			class.forName("com.mysql.cj.jdbc.Driver");
			
		}
	}

}
