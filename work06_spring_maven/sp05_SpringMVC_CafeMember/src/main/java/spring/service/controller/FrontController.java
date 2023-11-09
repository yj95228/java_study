package spring.service.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.service.domain.MemberVO;
import spring.service.user.MemberDAO;

@Controller
public class FrontController {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@RequestMapping("/find.do")
	public ModelAndView getMember(String id) throws Exception{
		MemberVO member = memberDAO.getMember(id);
		if(member != null) {
			return new ModelAndView("find_ok", "member", member);			
		}else {
			return new ModelAndView("find_fail");
		}
	}
	
	@RequestMapping("/register.do")
	public ModelAndView registerMember(MemberVO vo) throws Exception{
		memberDAO.registerMember(vo);
		return new ModelAndView("register_result", "vo", vo);
	}
	
	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request, MemberVO vo) throws Exception{
		MemberVO member = memberDAO.login(vo);
		if(member != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			return new ModelAndView("login_result", "member", member);			
		}else {
			return new ModelAndView("find_fail");
		}
	}
	
	@RequestMapping("/showAll.do")
	public ModelAndView showAll() throws Exception{
		List<MemberVO> list = memberDAO.showAllMember();
		return new ModelAndView("allView", "list", list);
	}
	
	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		session.invalidate();
		return new ModelAndView("logout");
	}
}
