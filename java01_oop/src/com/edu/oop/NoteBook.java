package com.edu.oop;

public class NoteBook {
	// 필드 선언
	public String brand;
	public int price;
	public int serialNumber;
	
	// 메소드 정의
	public String printInfo() {
		// System.out.println("브랜드: " + brand + " 가격: " + price + " SN: " + serialNumber);
		return "브랜드: " + brand + " 가격: " + price + " SN: " + serialNumber;
	}
	
	// 기능 추가... 필드에 값 할당하는 기능...
	public void setNoteBook(int serialNumber, String brand, int price) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
	}
}
