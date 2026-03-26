package test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		Login obj = new Login();
		if(obj.check(user, pass)) {
			/*
			 * RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			 * rd.forward(request, response);
			 */
			response.sendRedirect("welcome.jsp");
		}
		else {
			/*
			 * RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			 * rd.forward(request, response);
			 */
			response.sendRedirect("error.jsp");
		}
	}

}
