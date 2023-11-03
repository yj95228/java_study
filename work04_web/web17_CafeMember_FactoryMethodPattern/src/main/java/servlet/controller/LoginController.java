package servlet.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
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
			
		}
		
		return new ModelAndView(path);
	}
	
}
