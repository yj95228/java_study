package web.controller;

public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {
		System.out.println("공장 가동중");
	}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	// Component를 생성하는 공장의 기능을 정의
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("login")) {
			controller = new LoginController();
			System.out.println("LoginController created");
		}else if(command.equals("find")) {
			controller = new FindController();
			System.out.println("FindController created");
		}else if(command.equals("register")) {
			controller = new RegisterController();
			System.out.println("RegisterController created");
		}
		
		return controller;
	}
}
