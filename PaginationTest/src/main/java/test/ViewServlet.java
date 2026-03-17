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

    public ViewServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String pid = request.getParameter("page");
		int pageid = Integer.parseInt(pid);
		
		int pagelimit = 5;
		if(pageid == 1) {
			
		}
		else {
			pageid = pageid-1;
			pageid = pageid*pagelimit + 1;
		}
		List<Emp> list = EmpDataAccess.getRecords(pageid, pagelimit);
		pw.print("<h1>Page Number"+pid+"</h1>");
		
		pw.print("<table border='2' cellpadding ='4' width ='60%' >");
		pw.print("<tr><th>Id</th><th>Name</th><th>Country</th></tr>");
		
		for(Emp e : list) {
			
			pw.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getCountry()+"</td></tr>");
		} 
		    pw.print("</table>");
		    pw.print("<a href='ViewServlet?page=1'>1</a> ");
			pw.print("<a href='ViewServlet?page=2'>2</a> ");
			pw.print("<a href='ViewServlet?page=3'>3</a> ");
			
			pw.close();
			
		
		
	}

}
