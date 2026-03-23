package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EvenOddServlet")
public class EvenOddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EvenOddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int num =Integer.parseInt(request.getParameter("num"));
		pw.print("<html><body>");
		
		if(num % 2==0) {
			pw.print("<h2>" + num +" is Even Number </h2>");
		}
		else {
			pw.print("<h2>" + num +" is Odd Number </h2>");
		}
		pw.print("</html></body>");
	}

}
