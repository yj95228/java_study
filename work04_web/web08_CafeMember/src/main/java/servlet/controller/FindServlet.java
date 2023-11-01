package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;


@WebServlet("/Find")
public class FindServlet extends HttpServlet {
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
        System.out.println("서블릿 진입...");
        // 1. 폼값 받아서 리턴
        String id = request.getParameter("id");
        String path = "find_fail.jsp";
        // 2. DAO 리턴 받아서 비즈니스 로직 호출 -> 데이터 반환
        try {
        	MemberVO vo = MemberDAOImpl.getInstance().findByIdMember(id);
        	System.out.println(vo);
        	if(vo != null) { // 찾고자 하는 멤버가 존재한다면
        		// 3. 반환값 바인딩
        		request.setAttribute("vo", vo);
        		path = "find_ok.jsp";
        	}
        }catch(SQLException e){
        	
        }
        // 4. 페이지 이동
        request.getRequestDispatcher(path).forward(request, response);
	}

}
