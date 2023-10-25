package com.edu.condition.test;

import java.util.Scanner;

/*
 컴파일 시점에 값이 입력되면 동일한 결과만 계속 출력됨
 실행 시점에서 서로 다른 값을 입력받을 수 있도록 코드를 작성
 
 Scanner 사용
 */
public class GradeIfTest2 {
//	int grade = 99;		-> 필드
	public static void main(String[] args) {
		System.out.println("점수 입력>> ");
		// 키보드로 값을 읽음
		Scanner sc = new Scanner(System.in);
//		int grade = 88;			// 88 -> literal value (실제 값)
		int grade = sc.nextInt();
		
		System.out.println("과목 입력>> ");
		String subject = sc.next();
		
		if(grade > 90 & grade <= 100) System.out.println(subject + ", A grade");
		else if(grade > 80 & grade <= 90) System.out.println(subject + ", B grade");
		else if(grade > 70 & grade <= 80) System.out.println(subject + ", C grade");
		else System.out.println(subject + ", F grade");
		
//		if(grade > 90 & grade <= 100) {
//			System.out.println(subject + ", A grade");
//		}else if(grade > 80 & grade <= 90) {
//			System.out.println(subject + ", B grade");
//		}else if(grade > 70 & grade <= 80) {
//			System.out.println(subject + ", C grade");
//		}else {
//			System.out.println(subject + ", F grade");
//		}

	}

}
