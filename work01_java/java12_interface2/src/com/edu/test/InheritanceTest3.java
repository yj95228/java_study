package com.edu.test;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;
import com.edu.service.impl.EmployeeServiceImpl;
import com.edu.util.MyDate;

public class InheritanceTest3 {

	public static void main(String[] args) {
		Manager m = new Manager("James",new MyDate(1999, 1, 2),300000.0,"IT");
		Engineer eg = new Engineer("Peter", new MyDate(1990, 2, 3), 400000.0, "JAVA", 10000.0);
		Secretary s = new Secretary("Tomas", new MyDate(1992, 3, 4), 250000.0, "James");
		Engineer eg1 = new Engineer("Peter1", new MyDate(1990, 2, 3), 400000.0, "Python", 10000.0);
		Manager m1 = new Manager("James1",new MyDate(1998, 1, 2),300000.0,"AI");
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(m);
		emps.add(eg);
		emps.add(s);
		emps.add(eg1);
		emps.add(m1);
		
		//Service객체 생성 == 메모리에 기능들을 로딩시킴
		EmployeeService service = new EmployeeServiceImpl();
		
		//=========== 서비스 기능을 호출 ===========
		
		System.out.println("\n====1. 직원 정보를 출력합니다 ======");
		service.printAllEmployee(emps);
		
		
		System.out.println("\n====2. 특정 직원을 검색 ======");
		Employee e1=service.findEmployee(emps, "James");
		System.out.println(e1);
		
		
		System.out.println("\n====3. 동일한 부서의 직원을 검색 ======");
		System.out.println(service.findEmployeeByDept(emps, "IT"));
		
		System.out.println("\n====4. 특정 직원의 연봉을 검색 ======");
		System.out.println(service.getAnnualSalary(m));
		
		System.out.println("\n====5. 직원의 총 인건비를 검색 ======");
		System.out.println(new BigDecimal(service.getTotalCost(emps)));
		System.out.format("%10f%n", service.getTotalCost(emps));
	}
}




















