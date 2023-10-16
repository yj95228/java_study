package com.edu.condition.test;

import java.util.Scanner;

public class SwitchGradeTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 >>");
		int grade = sc.nextInt();
		switch(grade) {
		case 90:
		case 100:
			System.out.println("A");
			break;
		case 80:
		case 85:
			System.out.println("B");
			break;
		case 70:
		case 75:
			System.out.println("C");
			break;
		default:
			System.out.println("출력 완료");
		}
		System.out.println("swtich문 빠져나옴");
	}

}
