package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

/**
 * Servlet implementation class AllMemberServlet
 */
@WebServlet("/AllMember")
public class AllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        // 1. DAO 반환 받아서 비즈니스 로직 호출 -> 데이터 반환
        try {
			ArrayList<MemberVO> list = MemberDAOImpl.getInstance().showAllMember();
			// 2. 바인딩
			request.setAttribute("list", list);
			// 3. 페이지 이동 -> allView.jsp
			request.getRequestDispatcher("allView.jsp").forward(request, response);
		} catch (SQLException e) {
			System.out.println("회원 정보가 존재하지 않습니다");
		}
        
	}

}
