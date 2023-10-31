package web.servlet.redirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Redirect2")
public class ChoiceRedirect2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChoiceRedirect2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 폼값 받아서
		// 2-1. city값이 null이 아니면 redirect2.jsp로 forwarding
		// 2-2. city값이 null이면 error2.html로 redirecting
		String city = request.getParameter("city");
		if(city != null) {
			request.getRequestDispatcher("redirect2.jsp").forward(request, response);
		}else {
			response.sendRedirect("./error/error2.html");
		}
	}

}
