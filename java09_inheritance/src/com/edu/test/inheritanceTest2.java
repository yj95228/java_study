package com.edu.test;

import java.util.ArrayList;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class inheritanceTest2 {

	public static void main(String[] args) {
		Manager m = new Manager("James", new MyDate(1999, 1, 2), 300000.0, "IT");
		Engineer eg = new Engineer("Peter", new MyDate(1990, 2, 3), 400000.0, "JAVA", 10000.0);
		Secretary s = new Secretary("Tomas", new MyDate(1992, 3, 8), 350000.0, "Peter");
		Engineer eg1 = new Engineer("Peter1", new MyDate(1990, 2, 3), 400000.0, "Python", 10000.0);
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(m);
		emps.add(eg);
		emps.add(s);
		emps.add(eg1);
		
		System.out.println("Employee의 정보");
		for(Employee e: emps) System.out.println(e.getDetails());
		
		System.out.println("Employee의 연봉");
		double annualSalary = 0.0;
		
		for(Employee e: emps) {
			annualSalary = e.getSalary()*12;
			if(e instanceof Engineer) {
//				Engineer engineer = (Engineer) e;	// Type Casting
//				annualSalary = engineer.getSalary() * 12 + engineer.getBonus();
				annualSalary = e.getSalary()*12 + ((Engineer) e).getBonus();
			}
			System.out.println(e.getName()+"의 연봉은 "+annualSalary+"달러 입니다");
		}
	}

}
