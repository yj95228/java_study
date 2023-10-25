package com.test;

import java.util.ArrayList;

import com.edu.child.Instructor;
import com.edu.child.Manager;
import com.edu.child.Student;
import com.edu.parent.Person;

public class PersonTest1 {

	public static void main(String[] args) {
		// s, i, m이라는 이름으로 각각 객체를 생성
		Student s = new Student(111, "김삼성", "신사동", "s111");
		Instructor i = new Instructor(222, "김티쳐", "역삼동", "i2222");
		Manager m = new Manager(333, "김관리", "방배동", "m333");
		
		Person s2 = new Student(444, "김국민", "혜화동", "s444");
		System.out.println(s);
		System.out.println(i);
		System.out.println(m);
		
		System.out.println("=====================================");
		
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(s);		persons.add(i);		persons.add(m);
		
		System.out.println("=====================================");
		((Student) s2).changeStuId("s404");
		System.out.println(s2.toString());
		
	}

}
