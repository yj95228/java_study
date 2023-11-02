package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.coyote.Request;

import servlet.model.User;
import servlet.model.UserDAO;
import servlet.model.UserDAOImpl;

@WebServlet("/login")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세부 로직 구현
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		User pvo = new User(id, password, "", "");
		try {
			User rvo = UserDAOImpl.getInstance().login(id, password);
			if (rvo!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("vo", rvo);
				request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
			}else {
				response.sendRedirect("error.jsp");
			}
		}catch (SQLException e) {
		}
	}//doProcess
}
