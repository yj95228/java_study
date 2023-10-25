package com.edu.oop;
/*
어떤 대상에게
어떤 인사말을 전할지를 지정하는 클래스

Greeting 클래스의
- 필드에 값을 주입(집어넣고)
- sayHello를 호출하는 기능을 하는
 Test(실행) 클래스를 작성해야 한다
 */
public class Greeting {
	// 필드(변수) 선언
	public String target;
	public String message;
	
	// 메소드 정의
	public void sayHello() {	// 선언부
		System.out.println(target + ", " + message);	// 구현부		 
	}
}
