package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String user = request.getParameter("username");
	        String pass = request.getParameter("password");

	      
	        String correctUser = "admin";
	        String correctPass = "1234";

	        out.println("<html><body>");

	        if (user.equals(correctUser) && pass.equals(correctPass)) {
	            out.println("<h2>Login Successful</h2>");
	        } else {
	            out.println("<h2>Invalid Credentials</h2>");
	        }

	        out.println("</body></html>");
	}

}
