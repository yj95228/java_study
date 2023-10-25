package com.edu.oop.test;

import com.edu.oop.Greeting;
/*
 * test 클래스
 1. Greeting 클래스 객체 생성 == Greeting 클래스의 구성요소를 메모리에 올린다
 2. Greeting 클래스의 필드에 값을 주입하고 메소드를 호출
 */
public class GreetingTest {

	public static void main(String[] args) {
		Greeting g = new Greeting();
		// 필드 접근 = 값 할당
		g.target = "길동아";
		g.message = "안녕";
		
		// 메소드 접근 = 함수 호출
		g.sayHello();
	}

}
