package web.controller;

public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	/// Component를 생성하는 공장의 기능을 정의
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("subject.do")) {
			System.out.println("subjectController");
			controller = new SubjectController();
		}else if(command.equals("branch.do")){
			System.out.println("branchController");
			controller = new BranchController();
		}
		return controller;
	}
}
