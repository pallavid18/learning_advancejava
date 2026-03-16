package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.print("<a href='index.html'>Add Employees</a>");
		pw.print("<h2>List of Employees</h2>");

		List<Emp> list = EmpDataAccess.getAllEmployees();

		pw.print("<table border='1' width='100%'>");

		pw.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");

		for(Emp e : list) {

			pw.print("<tr>");
			pw.print("<td>"+e.getId()+"</td>");
			pw.print("<td>"+e.getName()+"</td>");
			pw.print("<td>"+e.getPassword()+"</td>");
			pw.print("<td>"+e.getEmail()+"</td>");
			pw.print("<td>"+e.getCountry()+"</td>");

			pw.print("<td><a href='EditServlet?id="+e.getId()+"'>Edit</a></td>");
			pw.print("<td><a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td>");

			pw.print("</tr>");
		}

		pw.print("</table>");

		pw.close();
	}
}