package com.edu.child;

import com.edu.parent.Person;

public class Instructor extends Person{
	private String subject;
	
	public Instructor(int ssn, String name, String address, String subject) {
		super(ssn, name, address);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString()+" , "+subject;
	}
}
