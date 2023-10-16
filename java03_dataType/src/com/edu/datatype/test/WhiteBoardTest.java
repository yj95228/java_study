package com.edu.datatype.test;

import com.edu.datatype.MyDate;
import com.edu.datatype.WhiteBoard;

/*
 * 1. 객체 생성 == WhiteBoard의 멤버를 메모리에 올린다
 * 2. 접근 --- 함수 호출
 * 
 */
public class WhiteBoardTest {

	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();
		
		MyDate md = new MyDate();
		md.setMyDate(2023, 10, 11);
		
		// 실수형 값은 값 뒤에 타입을 명시적으로 지정할 수 있다
		wb.setWhiteBoard("합판", "제조사", true, 120.3F, 'L', md);
		System.out.println(wb.getWhiteBoard());
	}

}
