package com.edu.parent;

import com.edu.util.MyDate;

// 부모 클래스
public class Employee {
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public Employee() {};
	
	public Employee(String name, MyDate birthDate, double salary) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public String getDetails() {
		return name+" , "+birthDate.toString()+" ,"+salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name+" , "+birthDate.toString()+" ,"+salary;
	}
}
