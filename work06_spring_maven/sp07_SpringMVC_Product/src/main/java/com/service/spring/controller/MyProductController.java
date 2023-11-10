package com.service.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.spring.domain.MyProduct;
import com.service.spring.service.MyProductService;

@Controller
public class MyProductController {
	
	@Autowired
	private MyProductService myProductService;
	
	@RequestMapping("/myProduct.do")
	public String insert(MyProduct pvo, Model model) throws Exception{
		System.out.println("addProduct 호출 전 : "+pvo);
		myProductService.addProduct(pvo);
		model.addAttribute("msg", "상품 추가 - 성공");
		model.addAttribute("vo", pvo);
		System.out.println("addProduct 호출 후 : "+pvo);
		return "insert_result";
	}
	
	@RequestMapping("/mySearchProduct.do")
	public String myProductSearch(String command, String word, Model model) throws Exception{
		List<MyProduct> list = null;
		if (command.equals("findProductByName")) {
			list = myProductService.findProductByName(word);
		} else if (command.equals("findProductByMaker")) {
			list = myProductService.findProductByMaker(word);
		} else if (command.equals("findProducts")) {
			list = myProductService.findProducts();
		}		
		model.addAttribute("list", list);
		return "search_result";
	}
}
