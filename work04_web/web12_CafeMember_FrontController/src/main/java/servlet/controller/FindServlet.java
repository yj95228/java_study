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
	
		
		//로직은 여기서 작성...
		/*
		 1. 폼값 받아서
		 2. DAO리턴받고 비지니스 로직 호출...데이타 반환
		    
		 3. 바인딩
		 4. 페이지 이동
		 */
		
		String id = request.getParameter("id");
		String path = "find_fail.jsp";
		try {
			MemberVO vo=MemberDAOImpl.getInstance().findByIdMember(id);
			if(vo!=null) { //찾고자하는 멤버가 존재한다면...
				request.setAttribute("vo", vo);
				path = "find_ok.jsp";
			}
		}catch(SQLException e) {		
			
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
