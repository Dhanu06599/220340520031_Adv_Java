package com.cdac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
@WebServlet("/Hello")//url
public class Hello extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname = request.getParameter("fullname");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body.");
		out.write("<h1>Hello"+ fullname.toUpperCase()+ "<h1>");
		out.write("</body></html>");
		
//		request.getParameter();
	}

	

}
