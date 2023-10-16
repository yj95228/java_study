package com.edu.datatype;

// WhiteBoard에 대한 정보를 담는 클래스
/*
 * WhiteBoard를 구성하는 특징을 field로 선언
 * WhiteBoard를 통해서 행하는 기능을 method 정의
 * 
 * 클래스 작성 순서
 * 1. 필드 선언 : 이때 데이터 타입을 고민해서 잘 지정하기
 * 2. 필드에 값이 주입되는 통로를 함수로 정의 : setter 메소드 (void setMethod(~~)) - 필드 초기화
 * 3. 주입된 값을 다시 받아오는 함수를 정의 :: getter 메소드 (String getMethod())
 */
public class WhiteBoard {
	// 필드 선언
	public String material;
	public String madeCompany;
	public boolean scretch;
	public float price;
	public char size;
	public MyDate madeDate;
	
	// 메소드 정의 = 선언부 + 구현부	
	public void setWhiteBoard(  String material,
								String madeCompany,
								boolean scretch,
								float price,
								char size,
								MyDate madeDate ) {
		// 필드 초기화
		this.material = material;
		this.madeCompany = madeCompany;
		this.scretch = scretch;
		this.price = price;
		this.size = size;
		this.madeDate = madeDate;
	}
	
	
	// 
	public String getWhiteBoard() {
		// String이 아닌 것들 converting됨
		return material+"\t"+
			   madeCompany+"\t"+
			   scretch+"\t"+
			   price+"\t"+
			   size+"\t"+
			   madeDate.getMyDate();
	}
}
