package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
			1. 요청으로부터 세션 받아오기
			2. JSESSIONID 출력
			3. 폼값 받기
			4. MemberVO 생성.
			5. 비즈니스 로직 호출 
			6. 바인딩
			7. 네비게이션 Redirect BuyServlet
		 */
		HttpSession session =request.getSession(); //요청으로부터 세션 받아오기. 타입은 HttpSession 객체.
		System.out.println("JSESSIONID :: "+session.getId()); // JSESSIONID 값 
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberVO pvo = new MemberVO(id, password); // 생성자 오버로딩 기법 활용. 4개 인자 모두 안넣게 만들기.
		
		MemberVO rvo = new MemberVO(id, password, "길복순", "신사동"); // 요청 결과. 비즈니스 로직에 의해 나온값.
		
		session.setAttribute("vo", rvo);
		
		response.sendRedirect("BuyServlet");
	}

}
