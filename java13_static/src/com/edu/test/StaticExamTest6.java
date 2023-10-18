package com.edu.test;

import com.edu.service.EmployeeService;
import com.edu.service.impl.EmployeeServiceImpl;

public class StaticExamTest6 {

	public static void main(String[] args) {
		EmployeeService service = EmployeeServiceImpl.getInstance();
		
		// Polymorphism 때문에 아래도 상관 없음
		// EmployeeServiceImpl service = EmployeeServiceImpl.getInstance();

	}

}
