package com.edu.test;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

public class StaticExamTest4 {
	static int counter;
	public static void main(String[] args) {
		Person p = new Person("James", 44);
		System.out.println("Person Creating... Field Initialization...");
		
	}//main
	
	static {
		counter++;
		System.out.println("static Initialization block...");
	}
	
}//class
