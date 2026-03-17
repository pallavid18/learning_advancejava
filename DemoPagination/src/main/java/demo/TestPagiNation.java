package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/TestPagiNation")
public class TestPagiNation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestPagiNation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int page = 1;
		int recordPerPage = 3;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		int start = (page-1) * recordPerPage;
		String name[] = {"Riya","Amit","John","Karan","Neha","Pooja",
				         "Ram","Sita","Raj","Rocky"};
		pw.println("<h3>Employee List</h3>");
		
		for(int i=start; i<start+recordPerPage && i<name.length;i++) {
			pw.println(name[i]+" <br>");
		}
		
		pw.println("<br>");
		
		pw.print("<a href='TestPagiNation?page=1'>1</a> ");
		pw.print("<a href='TestPagiNation?page=2'>2</a> ");
		pw.print("<a href='TestPagiNation?page=3'>3</a> ");
		
		pw.close();
		
	}

}
