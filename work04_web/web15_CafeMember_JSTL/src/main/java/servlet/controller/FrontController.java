package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

@WebServlet("/front.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		String path = "index.jsp";
		if(command.equals("find")) {
			path = find(request, response);
		}else if(command.equals("register")) {
			path = register(request, response);
		}else if(command.equals("login")) {
			path = login(request, response);
		}else if(command.equals("showAll")) {
			path = showAll(request, response);
		}else if(command.equals("logout")) {
			path = logout(request, response);
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	public String find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		return path;
	}
	
	public String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        
        MemberVO pvo = new MemberVO(id, password, name, address);
        
        try {
        	MemberDAOImpl.getInstance().registerMember(pvo);

        }catch(SQLException e) {       
        	
        }
        
        return "register_result.jsp";
	}
	
	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		return path;
	}
	
	public String showAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
        	ArrayList<MemberVO> list=MemberDAOImpl.getInstance().showAllMember();
        	request.setAttribute("list", list);
        }catch(SQLException e) {
        	
        }
		return "allView.jsp";
	}
	
	public String logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "index.jsp";
    	HttpSession session = request.getSession();
    	if(session.getAttribute("vo") != null){
    		session.invalidate();
    		path = "logout.jsp";
    	}
		return path;
	}
}
