package com.edu.test;

import com.edu.child.Manager;
import com.edu.util.MyDate;

public class inheritanceTest1 {

	public static void main(String[] args) {
		Manager m = new Manager("James", new MyDate(1999, 1, 2), 300000.0, "IT");
		System.out.println(m);
		System.out.println(m.toString());
		System.out.println(m.getDetails());
	}

}
