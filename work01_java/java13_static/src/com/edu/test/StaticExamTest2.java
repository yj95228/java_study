package com.edu.test;

class Car{
	int serialNumber;	// 0 field v
	static int counter;	// 0 static v
	
	Car(){
		counter++;
		serialNumber = counter;
	}
}

public class StaticExamTest2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("===== field =====");
		System.out.println(car1.serialNumber);
		System.out.println(car2.serialNumber);
		System.out.println(car3.serialNumber);
		
		System.out.println("=====static V=====");
		System.out.println(Car.counter);
		System.out.println(car1.counter);
		System.out.println(car2.counter);
		System.out.println(car3.counter);
	}

}
