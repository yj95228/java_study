package com.edu.service;

import java.util.ArrayList;

import com.edu.parent.Employee;

public interface EmployeeService {
	void printAllEmployee(ArrayList<Employee> emps);
	Employee findEmployee(ArrayList<Employee> emps, String name);
	ArrayList<Employee> findEmployeeByDept(ArrayList<Employee> emps, String dept);
	double getAnnualSalary(Employee e);
	double getTotalCost(ArrayList<Employee> emps);
}
