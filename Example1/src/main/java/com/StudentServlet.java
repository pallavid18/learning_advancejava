package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");

	        PrintWriter out = response.getWriter();

	        String name = request.getParameter("name");
	        String age = request.getParameter("age");
	        String course = request.getParameter("course");

	        out.println("<html><body>");
	        out.println("<h2>Student Information</h2>");
	        out.println("Student Name: " + name + "<br>");
	        out.println("Age: " + age + "<br>");
	        out.println("Course: " + course);
	        out.println("</body></html>");
	}

}
