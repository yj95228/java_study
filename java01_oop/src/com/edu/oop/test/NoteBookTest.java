package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		
		// 필드 새로운 값 할당 (필드 초기화)
//		nb.brand = "삼성";
//		nb.price = 1234567;
//		nb.serialNumber = 987654321;
		
		nb.setNoteBook(111, "삼성", 1710000);
		
		// 메소드 접근 = 함수 호출
		nb.printInfo();
		
	}
}
