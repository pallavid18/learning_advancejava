package com;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/ServletConfig1")
public class ServletConfig1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletConfig1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
//thiss allow allow to access from different class opr global 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		ServletConfig sc = getServletConfig();
		String n = sc.getInitParameter("driver");
		String s = sc.getInitParameter("setting");
		pw.println("Your Driver name  : "+n  +"  "+s);

		
		ServletContext context = getServletContext();
		String p = context.getInitParameter("project");
		pw.println("Context Parameter is : "+p);
		
		pw.close();;
	}

}
