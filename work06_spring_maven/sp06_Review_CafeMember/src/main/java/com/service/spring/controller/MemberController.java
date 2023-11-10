package com.service.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.spring.domain.MemberVO;
import com.service.spring.user.MemberDAO;
import com.service.spring.user.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberDAO memberDAO;
	
	@RequestMapping("/find.do")
	public String find(String id, Model model) throws Exception{
		MemberVO rvo = memberService.getMember(id);
		String path = "find_fail";
		if(rvo != null) {
			model.addAttribute("vo", rvo);
			model.addAttribute("msg", "회원 검색 - 성공");
			path = "find_ok";
		}else {
			model.addAttribute("msg", "회원 검색 - 실패");
		}
		return path;
	}
	
	@RequestMapping("login.do")
	public String login(MemberVO pvo, HttpSession session) throws Exception{
		MemberVO rvo = memberService.login(pvo);
		if(rvo != null) {
			session.setAttribute("vo", rvo);
			return "login_result";
		}else {
			return "redirect:/index.jsp";
		}
	}
	
	@RequestMapping("register.do")
	public String register(MemberVO pvo) throws Exception{
		memberDAO.registerMember(pvo);
		return "redirect:/showAll.do";
	}

	@RequestMapping("showAll.do")
	public String showAll(Model model) throws Exception{
		List<MemberVO> list = memberService.showAllMember();
		model.addAttribute("list", list);
		return "allView";
	}
	
	@RequestMapping("update.do")
	public String update(MemberVO pvo, HttpSession session) throws Exception{
		if(session.getAttribute("vo") != null) {
			memberDAO.updateMember(pvo);
			session.setAttribute("vo", pvo);
			return "update_result";
		}
		return null;
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session) throws Exception{
		if(session.getAttribute("vo") != null) {
			session.invalidate();
			return "logout";
		}
		return null;
	}
}
