package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

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
		 1.폼값 받아서..
		 2. DAO리턴받고 비지니스 로직 호출...반환값..
		 3. 세션 얻어와서...바인딩
		 4. 네비게이션... login_result.jsp
		    만약에...반환값이 null 이라면...login_fail.jsp
		 */
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberVO pvo = new MemberVO(id, password, "", "");
		String path = "login_fail.jsp";
		try {
			MemberVO rvo=MemberDAOImpl.getInstance().login(pvo);
			if(rvo!=null) { //로그인 성공했다면..
				HttpSession session=request.getSession();
				session.setAttribute("vo", rvo);
				System.out.println("JESSIONID :: "+session.getId());
				path = "login_result.jsp";
			}
			
		}catch(SQLException e) {
			
		}//		
		request.getRequestDispatcher(path).forward(request, response);		
	}
}










