package web.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LifeCycleServlet"}, loadOnStartup = 1)
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LifeCycleServlet() {
        System.out.println("LifeCycleServlet() is called");
    }

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init() is called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("doGet() is called");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>LiftCycleServlet 출력 결과입니다</h2>");
		out.println("</body></html");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("doPost() is called");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>LiftCycleServlet 출력 결과입니다</h2>");
		out.println("</body></html");
		out.close();
	}
	
	public void destroy() {
		System.out.println("destroy() is called");
	}

}
