package com.edu.child;

import com.edu.parent.Flyer;

// 클래스가 인터페이스의 추상 메소드를 구현
// 클래스	   implements	인터페이스
public class Airplane implements Flyer{
	
	public static final int MAX_SPEED = 500;	// static : 전역 변수 <-> class 변수 : 지역 변수
	
	@Override
	public void fly() {
		System.out.println("비행기가 난다");
	}

	@Override
	public void land() {
		System.out.println("비행기가 착륙한다");
	}

	@Override
	public void takeOff() {
		System.out.println("비행기가 이륙한다");
	}

}
