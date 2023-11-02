package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Book;
import servlet.model.BookDAO;
import servlet.model.BookDAOImpl;

@WebServlet("/book/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] bookNoList = request.getParameterValues("bookNo");
		String isbn = "";
		for(int i=0; i<bookNoList.length; i++) {
			if(i==bookNoList.length-1) {
				isbn += bookNoList[i];
			} else {
				isbn += bookNoList[i] + "-";
			}
		}
		//폼값 받아서..
		String title = request.getParameter("bookTitle");
		String bookCategory = request.getParameter("bookCategory");
		String bookCountry = request.getParameter("bookCountry");
		String bookDate = request.getParameter("bookDate");
		String bookPublisher = request.getParameter("bookPublisher");
		String bookAuthor = request.getParameter("bookAuthor");
		String bookPrice = request.getParameter("bookPrice");
		String bookSummary = request.getParameter("bookSummary");

		
		Book book = new Book(isbn, title, bookCategory, bookCountry, bookDate, 
				bookPublisher, bookAuthor, Integer.parseInt(bookPrice), bookSummary);
		BookDAOImpl dao = BookDAOImpl.getInstance();
		try {
			dao.registerBook(book);
			request.setAttribute("book", book);
			//바인딩
			//bookSuccess.jsp로 이동하기
			request.getRequestDispatcher("bookSuccess.jsp").forward(request, response);
		} catch (SQLException e) {
			System.out.println("Register Failed.");
			response.sendRedirect("../error.jsp");  // error 페이지로 이동
		}
	}

}
