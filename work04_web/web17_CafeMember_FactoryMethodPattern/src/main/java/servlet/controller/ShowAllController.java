package servlet.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

public class ShowAllController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
        	ArrayList<MemberVO> list=MemberDAOImpl.getInstance().showAllMember();
        	request.setAttribute("list", list);
        }catch(SQLException e) {
        	
        }
		return new ModelAndView("allView.jsp");
	}
	
}
