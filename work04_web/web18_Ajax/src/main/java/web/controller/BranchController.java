package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BranchController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BranchController 진입");
		
		// DB 갔다왔다 치고
		String result = "<ul><li>SDS</li>"+"<li>DS</li>"+"<li>DX</li>";
		request.setAttribute("result", result);
		
		return new ModelAndView("result.jsp");
	}
	
}
