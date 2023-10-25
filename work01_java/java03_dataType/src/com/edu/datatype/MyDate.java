package com.edu.datatype;

// 제조년,월,일에 대한 정보를 담는 클래스
public class MyDate {
	int year;
	int month;
	int day;
	
	public void setMyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getMyDate() {
		return year+"\t"+month+"\t"+day;
	}
	
}
