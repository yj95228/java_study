package com.edu.service.impl;

import java.util.ArrayList;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	private static EmployeeServiceImpl service = new EmployeeServiceImpl();
	private EmployeeServiceImpl() {};
	public static EmployeeServiceImpl getInstance() {
		return service;
	}
	
	//1. 모든 직원의 정보를 출력하는 기능...일단 선언부만 작성 / 구현부는 나중에
	public void printAllEmployee(ArrayList<Employee> emps) {
		for(Employee e: emps) System.out.println(e.getDetails());
	}
	
	//2. 모든 직원중 특정한 직원을 검색하는 기능을 정의
	// find~~, search~~()
	public Employee findEmployee(ArrayList<Employee> emps, String name){
		Employee emp = null;
		for(Employee e: emps) {
			if(e.getName().equals(name)) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	
	//3. 모든 직원중에서 동일한 부서에서 일하는 직원들을 검색
	public ArrayList<Employee> findEmployeeByDept(ArrayList<Employee> emps, String dept){
		ArrayList<Employee> temp = new ArrayList<>();	
		for(Employee e: emps) {
			if((e instanceof Manager && ((Manager) e).getDept().equals(dept))) {
				temp.add(e);
			}
		}
		
		return temp;
	}
	
	//4. 특정한 직원의 연봉을 리턴하는 기능
	public double getAnnualSalary(Employee e) {
		double annualSalary = 0;
		
		annualSalary = e.getSalary() * 12;
		if(e instanceof Engineer)
			annualSalary = e.getSalary() * 12 + ((Engineer) e).getBonus();
		
		return annualSalary;
	}
	
	//5. 모든 직원의 총 인건비를 리턴
	public double getTotalCost(ArrayList<Employee> emps) {
		double total = 0;
		
		for(Employee e: emps) total += getAnnualSalary(e);
		
		return total;
	}
}
