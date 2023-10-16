package com.edu.parent;

// 날으는 것에 관련된 기능의 Template
/*
 * 1. 상수
 * 2. 추상 메소드 : public abstract
 * 만으로 구성 -> 필드는 없음
 */
public interface Flyer {
	public abstract void fly();
	void land();	// 앞에 public abstract 붙은건데 생략된거임
	void takeOff();
	
}
