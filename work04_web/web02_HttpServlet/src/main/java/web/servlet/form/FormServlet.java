package web.servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FS")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 처리 (양방향)
		//request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 응답
		PrintWriter out = response.getWriter();
		String id = request.getParameter("userId");
		String passwd = request.getParameter("userPass");
		// dao의 비즈니스 로직 호출 -> dao.login(id, pass) 이런 식으로
		out.println("<html><body>");
		out.println("<li>ID: "+id+"</li>");
		out.println("<li>PASS: "+passwd+"</li>");
		out.println("</body></html>");
		out.close();
		
	} // Thread가 메모리에서 unbind
}
