package com.edu.capsulation;

// 오늘 날짜 정보를 가지고 있는 클래스
/*
  필드에 다른 클래스에서 직접적으로 접근하는 것을 막는다
  
  월(1~12월)에 따라서 날짜가 달라진다
  1,3,5,7,8,10,12월 => 1~31
  2월 => 1~28
  4,6,9,11월 => 
 */
public class MyDate {
	private int month;	// 같은 클래스에서만 접근 허용
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 & month <= 12) {
			this.month = month;
		}else {
			System.out.println("1~12월로 숫자를 넣어주세요");
			System.exit(0);		// 0은 정상 종료, 음수는 비정상 종료
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
		case 2:
			if(1 <= day & day <= 28) {
				this.day = day;
			}else {
				System.out.println(this.month+"는 28일까지임");
				System.exit(0);		// 0은 정상 종료, 음수는 비정상 종료
			}
			break;
		default:
			if(month == 4 | month == 6 | month == 9 | month == 11) {
				if(1 <= day & day <= 30) {
					this.day = day;
				}else {
					System.out.println(this.month+"는 30일까지임");
					System.exit(0);		// 0은 정상 종료, 음수는 비정상 종료
				}
			}else if(1 <= month & month <= 12) {
				if(1 <= day & day <= 31) {
					this.day = day;
				}else {
					System.out.println(this.month+"는 31일까지임");
					System.exit(0);		// 0은 정상 종료, 음수는 비정상 종료
				}
			}
		}
	}
	
}
