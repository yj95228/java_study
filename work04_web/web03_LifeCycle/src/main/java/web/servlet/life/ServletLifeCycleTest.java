package web.servlet.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Life"}, loadOnStartup = 1) // Ready On
public class ServletLifeCycleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 0; 	// 필드 선언
	
	public ServletLifeCycleTest() {
		System.out.println("1. Servlet 객체를 생성 by Container");
    }

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("2. init 메소드 호출 by Container");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. doGet 호출 by Container (클라이언트 요청할 때마다)");
		
		// 1. 양방향 한글 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 2. PrintWriter 객체 return 받아오기
		PrintWriter out = response.getWriter();
		
		// 3. 브라우저로 출력
		out.println("<html><body bgcolor=yellow>");
		out.println("<h3>LifeCycle CallBack Method</h3>");
		out.println("<b>count: "+ ++count+"</b>");
		out.println("</body></html>");
		out.close();
	}
	
	public void destroy() {
		System.out.println("4. destroy 메소드 호출 by Container");
	}

}
