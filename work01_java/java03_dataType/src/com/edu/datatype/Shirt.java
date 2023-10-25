package com.edu.datatype;

/*
 * 필드 값 주입 방법 2가지 있음
 * 1. 명시적 생성자
 * 2. setter
 * -> 하는 일: 필드 초기화
 */

public class Shirt {
	public boolean longSleeved;
	public double price;
	public char size;
	
	// 기본 생성자
	public Shirt() {
		
	}
	
	// 명시적 생성자 (필드 초기화)
	public Shirt(boolean longSleeved, double price, char size) {
		this.longSleeved = longSleeved;
		this.price = price;
		this.size = size;
	}
	
	// setter (필드 초기화)
	public void setShirt(boolean longSleeved, double price, char size) {
		this.longSleeved = longSleeved;
		this.price = price;
		this.size = size;
	}
	
	public String getShirt() {
		return longSleeved+"\t"+price+"\t"+size;
	}
}
