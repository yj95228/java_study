package com.edu.capsulation.test;

import java.util.Scanner;

import com.edu.capsulation.MyDate;

public class MyDataTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력 >>");
		int month = sc.nextInt();
		
		System.out.println("날짜 입력 >>");
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		md.setMonth(month);			// not visible == access 문제 (md.month = 10;)
		md.setDay(day);				// 필드에 direct로 직접적으로 접근하면 안됨
		
		System.out.println("Today is "+md.getMonth()+"월 "+md.getDay()+"일");
	}

}
