package web.servlet.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		description = "영어식 인사말을 servlet에 전달하는 ServletConfig", 
		urlPatterns = { "/GS" },
		loadOnStartup = 1,
		initParams = { 
				@WebInitParam(name = "GREET", value = "Welcome to JAMBOREE")
		})
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String message;   
	
    public GreetServlet() {
    	System.out.println("1. 기본 생성자 호출하면서 servlet instance 생성됨 by container");
    }

	public void init() throws ServletException {
		System.out.println("2. init 호출 by container");
		message = getInitParameter("GREET");
		System.out.println("Greet Message "+message);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로직은 여기서 작성
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		System.out.println("3. service() 호출 by container");
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.println("<body><h3>"+name+", "+message+"</h3></body>");
		out.close();
	}

}
