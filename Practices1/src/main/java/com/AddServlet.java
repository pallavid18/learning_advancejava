package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        int n1 = Integer.parseInt(request.getParameter("num1"));
	        int n2 = Integer.parseInt(request.getParameter("num2"));

	        int sum = n1 + n2;

	        out.println("<html><body>");
	        out.println("<h2>Sum = " + sum + "</h2>");
	        out.println("</body></html>");
	}

}
