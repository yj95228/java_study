package web.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.servlet.dto.Member;

@WebServlet("/Find")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemberController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1. form값 받아서
		String address = request.getParameter("address");
		
		// 2 DAO return 받고 비즈니스 로직 호출
		// Member member = MemberDAO.getInstance.findMemberByAddress("여의도");
		Member member = new Member("아이유", 32, "여의도");
		
		// 3. 반환값 바인딩
		request.setAttribute("member", member);
		
		// 4. 페이지 이동 (forward) - 서버 상에서 다른 컴포넌트로 바로 이동하는 방법
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
	}

}
