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
        
        //로직은 여기에 작성
        /*
         1. DAO리턴받고 비지니스로직 호출...데이타 반환
         2. 바인딩
         3. 네비게이션...allView.jsp
         */
        try {
        	ArrayList<MemberVO> list=MemberDAOImpl.getInstance().showAllMember();
        	request.setAttribute("list", list);
        	request.getRequestDispatcher("allView.jsp").forward(request, response);
        }catch(SQLException e) {
        	
        }        
	}
}









