package com.Add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sqservlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out=res.getWriter();
		int k=(int) req.getAttribute("k");
		out.println("Result is : "+k);
	}
}
