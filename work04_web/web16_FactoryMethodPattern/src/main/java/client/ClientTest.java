package client;

import java.util.Scanner;

import web.controller.Controller;
import web.controller.ControllerFactory;

public class ClientTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">>>> Command Value ");
		
		String command = sc.next();
		// 1. 
		Controller controller = ControllerFactory.getInstance().createController(command);
		
		// 2.
		controller.handle();
	}

}
