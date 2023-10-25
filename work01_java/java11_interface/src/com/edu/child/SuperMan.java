package com.edu.child;

import com.edu.parent.Flyer;

// 클래스가 인터페이스의 추상 메소드를 구현
// 클래스	   implements	인터페이스
public class SuperMan implements Flyer{
	
	public static final int MAX_SPEED = 500;	// static : 전역 변수 <-> class 변수 : 지역 변수
	
	@Override
	public void fly() {
		System.out.println("슈퍼맨이 난다");
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨이 착륙한다");
	}

	@Override
	public void takeOff() {
		System.out.println("슈퍼맨이 이륙한다");
	}
	
	public String stopBullet() {
		return "망토로 총알을 막다";
	}
}
