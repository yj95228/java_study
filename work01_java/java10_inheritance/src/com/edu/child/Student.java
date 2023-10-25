package com.edu.child;

import com.edu.parent.Person;

public class Student extends Person{
	private String stuId;
	
	// 자식 객체 생성
	public Student(int ssn, String name, String address, String stuId) {
		
		// 부모 객체 생성이 먼저
		super(ssn, name, address);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void changeStuId(String stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return super.toString()+" , "+stuId;
	}
}
