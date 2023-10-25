package com.edu.exception;

// 삭제, 수정 사용
public class RecordNotFoundException extends Exception{
	
	public RecordNotFoundException(){
		this("This is RecordNotFoundException...");
	}
	
	public RecordNotFoundException(String message){
		super(message);
	}

}
