package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RequestScopeTest")
public class RequestScopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RequestScopeTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String n = request.getParameter("uname");
//		pw.print("Welcome   "+n);
		System.out.println("Welcome   "+n);
		request.setAttribute("surname", "Dhope");
		
		request.getRequestDispatcher("ServletOne").forward(request, response);
		
		pw.close();
	}

}
