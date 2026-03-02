package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletConfig2")
public class ServletConfig2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ServletConfig2() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		ServletContext context = getServletContext();
		String p = context.getInitParameter("project");
		pw.println("Context Parameter is : "+p);
		
		pw.close();
	}

}
