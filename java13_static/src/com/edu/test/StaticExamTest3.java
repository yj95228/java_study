package com.edu.test;

class A {
	public final static int BASIC_SALARY = 300;
	public final String test() {
		return "오버라이딩 금지";
	}
}
final class B {
	
}

//class C extends B{}

class D extends A{
//	public final String test() {
//		return "오버라이딩 금지";
//	}
	
//	BASIC_SALARY = 500;
}

public class StaticExamTest3 {

	public static void main(String[] args) {
		

	}

}
