package web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// hidden을 사용하지 않는 방법
		// http://127.0.0.1:8888/CP/subject.do
		String requestURI = request.getRequestURI();
		System.out.println("getRequestURI: "+requestURI);
		
		String contextPath = request.getContextPath();
		System.out.println("getContextPath: "+contextPath);
		
		String command = requestURI.substring(contextPath.length()+1);
		System.out.println("Command: "+command);
		
		ModelAndView mv = null;
		Controller controller = ControllerFactory.getInstance().createController(command);
		mv = controller.handleRequest(request, response);
		
		if(mv != null) {
			if(mv.isRedirect()) response.sendRedirect(mv.getPath());
			else request.getRequestDispatcher(mv.getPath()).forward(request, response);
		}
	}
	
}
