package web.servlet.generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet extends GenericServlet{
	
	// 클라이언트의 요청을 이 안에서 구현
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// 클라이언트의 요청 처리했다 치고
		System.out.println("Client Service() call");
		// Client 페이지에 다시 응답
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>");
		out.println("Hello GenericServlet");
		out.println("</h2></body></html>");
		
		out.close();
	}
	
}
