package com.edu.test;
/*
 * static 키워드 성질
1. Member Level에서만 사용 가능
2. 필드, 메소드 앞에 지정할 수 있다
3. static이 붙은 멤버는 객체 생성 없이 사용 가능
4. static이 붙은 멤버는 객체 생성하기 전 class 파일이 로더될 때 미리 메모리에 로딩
5. static 멤버는 생성된 객체들이 공유하는 값
 */

class StaticExam {
	static String name = "James";	// static v = class v
	static int age = 44;
	
	int count = 1;	// field
	
	public static void getMember() {
		System.out.println("우/유/빛/깔 "+name);
	}
	public void getMember2() {
		System.out.println("우/유/빛/깔 "+name);
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		StaticExam.getMember();
		
		
		StaticExam s = new StaticExam();
		s.getMember2();
	}

}
