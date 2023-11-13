package com.service.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.spring.domain.Phone;
import com.service.spring.domain.UserInfo;
import com.service.spring.model.PhoneService;

@Controller
public class PhoneController {
	
	@Autowired
	private PhoneService phoneService;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:index.jsp";
	}
	
	@GetMapping("login.do")
	public String getLoginForm() {
		return "Login";
	}
	
	@PostMapping("login.do")
	public String doLoginForm(UserInfo user, HttpSession session, Model model) {
		try {
			UserInfo selected = phoneService.select(user);
			if(selected != null) {
				session.setAttribute("loginUser", selected);
				model.addAttribute("title", "핸드폰 관리 - 성공");
				return "redirect:searchPhone.do";
			}else {
				return "Login";			
			}			
		}catch(Exception e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			model.addAttribute("message", "문제 내용 - 회원 로그인 진행 중 에러 발생");
			return "Error";
		}
	}
	
	@GetMapping("searchPhone.do")
	public String getList(Model model) {
		try {
			List<Phone> phones = phoneService.select();
			model.addAttribute("phones", phones);
			model.addAttribute("title", "핸드폰 관리 - 폰 목록 리스트");
			System.out.println(phones);
			return "PhoneList";
		}catch(Exception e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			model.addAttribute("message", "문제 내용 - 폰 목록 조회 중 에러 발생");
			return "Error";
		}
	}
	
	@GetMapping("detail.do")
	public String doDetail(Phone phone, Model model) {
		try {
			Phone selected = phoneService.select(phone);
			model.addAttribute("phone", selected);
			model.addAttribute("title", "핸드폰 관리 - 폰 목록 리스트");
			return "PhoneView";
		}catch(Exception e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			model.addAttribute("message", "문제 내용 - 폰 상세보기 중 에러발생");
			return "Error";
		}
	}
	
	@GetMapping("regPhone.do")
	public String getRegister() {
		return "PhoneReg";
	}
	
	@PostMapping("savePhone.do")
	public String postRegister(Phone phone, Model model) {
		try {
			phoneService.insert(phone);
			model.addAttribute("title", "핸드폰 관리 - 폰 등록 성공");
			return "Result";
		}catch(Exception e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			model.addAttribute("message", "문제 내용 - 폰 상세보기 중 에러발생");
			return "Error";
		}
	}
}
