package web.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 쿠키 생성
		Cookie c1 = new Cookie("id", "scsa21");
		Cookie c2 = new Cookie("today", "2023-11-01");
		
		// 쿠키 유효기간 설정 setMaxAge()
		c1.setMaxAge(24*60*60);	// 시*분*초 (브라우저에 저장되는 시간)
		c2.setMaxAge(0);		// 쿠키 사용안함
		
		// 2. 브라우저로 보내기
		response.addCookie(c1);
		response.addCookie(c2);
		
		// 3. 페이지 이동
		response.sendRedirect("getCookie.jsp");
	}

}
