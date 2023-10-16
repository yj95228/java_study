package com.edu.vo.test;

import com.edu.vo.Member;

public class MemberTest {

	public static void main(String[] args) {
		// 1. 객체 생성될 때 값이 주입 == Member의 멤버를 메모리에 올린다
		Member mem1 = new Member("James", 45, "james@google.com");
		Member mem2 = new Member("Tomas", 55, "tomas@google.com");
		
		// 2. 함수 호출하여 값을 콘솔창에 나오게
		System.out.println(mem1.memberInfo());
		System.out.println(mem2.memberInfo());
	}

}
