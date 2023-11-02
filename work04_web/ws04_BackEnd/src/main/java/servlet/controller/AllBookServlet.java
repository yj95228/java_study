package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Book;
import servlet.model.BookDAOImpl;

@WebServlet("/book/AllBook")
public class AllBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세부 로직 구현
		BookDAOImpl dao = BookDAOImpl.getInstance();
		ArrayList<Book> list;
		try {
			list = dao.showAllBook();
			System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("booklist.jsp").forward(request, response);
			
		}catch (SQLException e) {
			response.sendRedirect("error.jsp");
		}
		
			//booklist.jsp로 이동
		
		    //예외 발생시 error 페이지로 이동
		
		
	}

}
