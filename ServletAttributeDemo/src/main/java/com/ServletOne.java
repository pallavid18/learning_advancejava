package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
//---------------------Request Scope----------------------------------		
		String n = request.getParameter("uname");
//		pw.print("Welcome   "+n);
		System.out.println("Welcome   "+n);    // dispalyed on console
		request.setAttribute("surname", "Dhope");
		
//--------------------Session Scope-----------------------------------		
		HttpSession hs = request.getSession();
		hs.setAttribute("dname", "Admin");
		
//--------------------Application Scope-------------------------------		
		ServletContext sc = request.getServletContext();
		sc.setAttribute("sname", "Riya");

//-------------Forward--------		
		request.getRequestDispatcher("ServletTwo").forward(request, response);
		
		pw.close();
	}

}
