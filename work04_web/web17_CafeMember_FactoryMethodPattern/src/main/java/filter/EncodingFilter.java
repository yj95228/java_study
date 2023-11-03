package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

//클라이언트에서 들어오는 모든 요청을 가로채어서 얘기 직접 받는다...
@WebFilter(value= {"/*"})
public class EncodingFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//1. 양방향 한글처리...공통로직 작성...
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//2. chain 을 사용해서 서버상에 등록된 모든 컴포넌트들에게 차례로 로직을 적용
		chain.doFilter(request, response);//
		
	}

}



