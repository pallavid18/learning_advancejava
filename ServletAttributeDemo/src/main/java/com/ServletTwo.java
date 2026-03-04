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

@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String n = request.getParameter("uname");
		String np = (String) request.getAttribute("surname");
		pw.print("Hello   "+n  +"  "+np );
		
		HttpSession hs = request.getSession(true);
		String s = (String) hs.getAttribute("dname");
//		pw.println(" "+s);
		
		ServletContext sc = request.getServletContext();
		String m =(String) sc.getAttribute("sname");
		pw.println("    "+"Session Scope : "+s+"   "+"Application scope : "+m);
		
		pw.close();
		
	}

}
