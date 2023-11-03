package servlet.controller;

// command값에 따라서 Controller를 생성하는 공장
public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	// Controller 생성하는 기능을 정의
	public Controller createController(String command) {
		Controller controller = null;
		System.out.println(command+"컨트롤러");
		if(command.equals("find")) {
			controller = new FindController();
			System.out.println("FindController created");
		}else if(command.equals("login")) {
			controller = new LoginController();
			System.out.println("LoginController created");
		}else if(command.equals("register")) {
			controller = new RegisterController();
			System.out.println("RegisterController created");
		}else if(command.equals("showAll")) {
			controller = new ShowAllController();
			System.out.println("ShowAllController created");
		}else if(command.equals("logout")) {
			controller = new LogoutController();
			System.out.println("LogoutController created");
		}
		
		return controller;
	}
}
