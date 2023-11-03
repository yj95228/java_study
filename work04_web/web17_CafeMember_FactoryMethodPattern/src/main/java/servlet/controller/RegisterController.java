package servlet.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

public class RegisterController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        
        MemberVO pvo = new MemberVO(id, password, name, address);
        
        try {
        	MemberDAOImpl.getInstance().registerMember(pvo);

        }catch(SQLException e) {       
        	
        }
        
		return new ModelAndView("register_result.jsp");
	}
	
}
