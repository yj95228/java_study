package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubjectController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SubjectController 진입");
		
		// DB 갔다왔다 치고
		String result = "JAVA  |  JDBC  |  WEB  |  FRONT  |  SPRING  |  AI  ";
		request.setAttribute("result", result);
		
		return new ModelAndView("result.jsp");
	}
	
}
