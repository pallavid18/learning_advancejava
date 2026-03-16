package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.print("<h2>Delete Employees</h2>");
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		
		int status = EmpDataAccess.delete(id);
		
		if(status>0) {
			response.sendRedirect("ViewServlet");
		}
		else {
			pw.print("Sorry, Unable to delete  the record");
		}
		
		pw.close();
		
	}

}
