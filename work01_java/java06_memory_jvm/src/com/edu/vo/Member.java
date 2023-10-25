package com.edu.vo;

public class Member {
	
	public String name;
	public int age;
	public String email;
	
	// 생성자: 객체가 생성될 때마다 호출되는 애
	// 1. 기본 생성자 - 구현부에서 아무것도 안하고 필드 초기화 X : public Member() {}
	// 2. 명시적 생성자 - 이거 있으면 기본 생성자 제공 X
	
	// Constructor Overloading
	// 1. 인자값의 순서, 개수, 타입 중 하나라도 달라야 함
	// 2. 생성자 이름은 반드시 같아야 한다
	public Member() {}
	
	// 명시적 생성자 : 객체 생성하자마자 주입 - lifecycle을 같이 할 때
	public Member(String name, int age, String email) {
		// 필드 초기화
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	// 오버로딩 : 객체 생성은 똑같은데 주입이 다른거
	public Member(String name, int age) {
		// 필드 초기화
		this.name = name;
		this.age = age;
	}
	public Member(int age, String name) {
		// 필드 초기화
		this.name = name;
		this.age = age;
	}
	
	// setter 방식 : 생성하고 나서 나중에 값 주입 - lifecycle을 같이 하지 않을 때
	public void setMember(String name, int age, String email) {
		// 필드 초기화
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public String memberInfo() {
		return name+"\t"+age+"\t"+email;
	}
}
