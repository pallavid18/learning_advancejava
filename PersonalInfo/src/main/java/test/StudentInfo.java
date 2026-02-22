package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentInfo")
public class StudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("username");
		String city = request.getParameter("city");
		String age = request.getParameter("age");
		String education = request.getParameter("education");
		
		pw.println("<html><body>");
		pw.println("<h2>Student Login </h2>");
		pw.println("<h2>Welcome "+name +"</h2>");
		pw.println("<h2>City : "+city+"</h2>");
		pw.println("<h2>Age : "+age+"</h2>");
		pw.println("<h2>Education : "+education+"</h2>");
		pw.println("</body></html>");
	}

}
