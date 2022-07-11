package cdac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Registration
 */
@WebServlet("/login")
public class Loginservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginService loginservice = new LoginService();
		boolean isValid = loginservice.loginCheck (username,password);
		
		if (isValid)
			response.sendRedirect("Welcome.html");
		else
			response.sendRedirect("login.html");
		
		
	}

}


