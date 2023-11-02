package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*
		 	1. 기존의 세션을 받아온다. 
		 	2. 세션에 바인딩된 값이 null이 아니라면... vo   getattriubte!=null -> 로그인된 상태
		 		해당 세션에 내가 구매한 책 정보를 바인딩..."pbook"."java book"
		 		페이지 이동 buy_result.jsp forwarding
		 	3. 로그인 상태가 아니라면 .. 로그인 페이지로 redirect
		 	
		 */
		HttpSession session = request.getSession();
			if (session.getAttribute("vo")!=null) {
				System.out.println("JSESSIONID :: "+session.getId() );
				session.setAttribute("pbook", "java book");
				request.getRequestDispatcher("buy_result.jsp").forward(request, response);
			}else {
				response.sendRedirect("login.html");
			}
	}



}
