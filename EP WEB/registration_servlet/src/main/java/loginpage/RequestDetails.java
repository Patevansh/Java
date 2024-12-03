package loginpage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDetails")
public class RequestDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Request Details</h2>");
        out.println("<p>Method: " + request.getMethod() + "</p>");
        out.println("<p>Query String: " + request.getQueryString() + "</p>");
        out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
        out.println("<p>Protocol: " + request.getProtocol() + "</p>");
        out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");

        out.println("<h3>Headers:</h3>");
        java.util.Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            out.println("<p>" + headerName + ": " + request.getHeader(headerName) + "</p>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
