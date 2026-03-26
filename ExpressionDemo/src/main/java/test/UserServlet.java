package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("name");
		String e = request.getParameter("email");
		String c = request.getParameter("city");
		
		User u = new User();
		u.setName(n);
		u.setEmail(e);
		u.setCity(c);

		request.setAttribute("user", u);
		request.getRequestDispatcher("details.jsp").forward(request, response);
		
	}

}
