package com.edu.child;

import com.edu.parent.Person;

public class Manager extends Person{
	private String dept;
	
	public Manager(int ssn, String name, String address, String dept) {
		super(ssn, name, address);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+" , "+dept;
	}
}
