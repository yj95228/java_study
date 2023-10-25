package com.edu.datatype.test;

import com.edu.datatype.Shirt;

/*
 * 1. 객체 생성 == Shirt 클래스 멤버를 메모리에 로딩한다
 * 2. 멤버 접근 ... 함수 호출
 */
public class ShirtTest {

	public static void main(String[] args) {
		// 생성자는 객체가 생성될 때마다 구동하는 것
//		Shirt t1 = new Shirt();					// 맨 앞 Shirt는 type 뒤에 Shirt는 생성자
//		t1.setShirt(true, 24.1, 'M');
//		System.out.println(t1.getShirt());		// setShirt 안 해도 false 0.0 으로 print
		
		Shirt t1 = new Shirt(true, 23.8, 'M');
		System.out.println(t1.getShirt());
	}

}
