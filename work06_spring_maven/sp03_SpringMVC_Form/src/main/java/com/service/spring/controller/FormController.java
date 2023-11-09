package com.service.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@RequestMapping("/form.do")
	public ModelAndView doform(String name, String addr) {
		
		// 1. form 값 받아서 - Spring 자동 바인딩 되서 처리 필요 X
		// String name = request.getParameter("name");
		
		// 2. dao 리턴 받고 비즈니스 로직 호출해서 데이터 반환
		
		// 3. 데이터 바인딩 - Spring 처리
		
		// 4. forward - Spring 처리
		
		return new ModelAndView("form_result", "info", name+"님이 사는 곳은 "+addr);
	}
}
