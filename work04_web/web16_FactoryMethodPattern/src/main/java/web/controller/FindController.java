package web.controller;

public class FindController implements Controller{

	@Override
	public String handle() {
		// 1. form값 받아서
		// 2. DAO 리턴 받고
		// 3. 비즈니스 로직 호출해서 데이터 반환
		// 4. 바인딩
		// 5. 네비게이션
		System.out.println("FindController (Find Logic)");
		return "find_result.jsp";
	}
	
}
