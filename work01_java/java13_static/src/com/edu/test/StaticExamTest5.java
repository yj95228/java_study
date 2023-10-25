package com.edu.test;

/*
 *  Singleton Pattern
- 클래스로부터 오직 단 한개의 Instance 만 생성되도록 하는 디자인 패턴

1. 일단 클래스 안에서 객체 하나는 생성
    - static private 지정해서 객체를 생성
2. 다른 클래스에서는 해당 클래스 타입으로 객체를 생성하지 못하도록 막아둔다
    - private 생성자
        - 이렇게 하면 다른 곳에서 생성 못함
3. 하나 생성된 객체는 여기저기서 갖다 쓰도록 public한 기능으로 만들어놓는다
    - !!!
    - public ServiceImpl getInstance() { }
 */

class ServiceImpl{
	private static ServiceImpl service = new ServiceImpl(); // 1
	private ServiceImpl() { // 2
		System.out.println("Singletone Pattern");
	}
	public static ServiceImpl getInstance() { // 3
		return service;
	}
}

public class StaticExamTest5 {

	public static void main(String[] args) {
		// ServiceImpl s = new ServiceImpl();
		ServiceImpl service1 = ServiceImpl.getInstance();
		ServiceImpl service2 = ServiceImpl.getInstance();
		ServiceImpl service3 = ServiceImpl.getInstance();
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
	}//main

}//class
