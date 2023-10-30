package web.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/params"}, loadOnStartup = 1)
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParameterServlet() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init() is called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String job = request.getParameter("job");
		String pageNo = request.getParameter("pageNo");
		String searchWord = request.getParameter("searchWord");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>job: "+job+"</h2>");
		out.println("<h2>pageNo: "+pageNo+"</h2>");
		out.println("<h2>searchWord: "+searchWord+"</h2>");
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>name: "+name+"</h2>");
		out.println("<h2>email: "+email+"</h2>");
		out.println("<h2>gender: "+gender+"</h2>");
		out.print("<h2>hobby: ");
		for(String h: hobby) {
			out.print(h+" ");
		}
		out.println("</h2>");
		out.println("<h2>favorite: "+favorite+"</h2>");
		out.println("<h2>desc: "+desc+"</h2>");
		out.println("</body></html>");
		out.close();
	}

}
