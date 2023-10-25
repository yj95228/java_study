package com.edu.greet;
/*
 * Greeting이라는 클래스는
 * 인삿말을 출력하는 기능을 하는 클래스이다
 * 
 * 하지만 핵심적인 모든 성분들을 아무런 구조적인 작업 없이
 * 전부다 main() 블럭 안에 다 때려넣어서 재사용성이 급격히 떨어지는 프로그램으로 전락
 */
public class Greeting {

    // 실행 메소드, main method
	public static void main(String[] args) {
		// 콘솔창에 메세지 출력
		System.out.println("Hello World");
	}

}
