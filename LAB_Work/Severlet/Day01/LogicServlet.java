package cdac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LogicServlet
 */
@WebServlet("/login2")
public class LogicServlet extends HttpServlet {
			
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String e = request.getParameter("email");
		
		Loginservice2 loginservice = new Loginservice2 ();
		
		boolean isValid = loginservice.loginCheck(username , password);
		
		if (isValid) {
			String remberMe = request.getParameter("remberMe");
			
			if (remberMe != null && remberMe.equals("yes")) {
				Cookie c1 = new Cookie ("uname", username);
				Cookie c2 = new Cookie("upass",password);
				c1.setMaxAge(60);
				c2.setMaxAge(60);
				response.addCookie(c1);
				response.addCookie(c2);
			}
			
			response.sendRedirect("Welcome.html");			
			
		}
		
		response.sendRedirect("login.html");
		
	}

}
