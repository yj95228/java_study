package com.edu.condition.test;

/*
 변수(Variable)
 변수가 선언된 위치에 따라서 필드와 로컬변수가 결정
 * 클래스 바로 아래 / 메소드 영역 바깥에 선언 --> 필드
 	- 필드는 선언만 하더라도 기본값을 가진다
 	- 숫자 0 / 논리형 false, 클래스 null
 * 메소드 영역 안에 선언 --> 로컬 변수
 	- 선언하더라도 기본값이 없음
 	- 사용하기 전 반드시 초기화 해서 사용

 - 멤버 변수 | 필드
 - 지역 변수 | 로컬 변수
 */
public class GradeIfTest {
//	int grade = 99;		-> 필드
	public static void main(String[] args) {
		// 로컬 변수 초기화
		// 컴파일 시점에 실제값이 동작하면 안됨 --- 하드 코딩
		int grade = 88;			// 88 -> literal value (실제 값)
		if(grade > 90 & grade <= 100) {
			System.out.println("A grade");
		}else if(grade > 80 & grade <= 90) {
			System.out.println("B grade");
		}else if(grade > 70 & grade <= 80) {
			System.out.println("C grade");
		}else {
			System.out.println("F grade");
		}

	}

}
