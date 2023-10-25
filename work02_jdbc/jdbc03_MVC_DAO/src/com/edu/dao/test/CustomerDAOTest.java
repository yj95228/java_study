package com.edu.dao.test;

import java.util.ArrayList;

import com.edu.dao.impl.CustomerDAOImpl;
import com.edu.exception.DuplicateIDException;
import com.edu.exception.RecordNotFoundException;
import com.edu.vo.Customer;

import config.ServerInfo;

public class CustomerDAOTest {

	public static void main(String[] args) throws Exception{
		CustomerDAOImpl dao = CustomerDAOImpl.getInstance();
		
		// 서비스 요청
//		try {
//			dao.addCustomer(new Customer(777, "구룡포", "신사동"));	// 단위테스트
//		}catch(DuplicateIDException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			dao.deleteCustomer(888);
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
//		dao.getCustomer(111);
//		dao.updateCustomer(new Customer(777, "구룡포", "포항"));
		
//		ArrayList<Customer> customers = dao.getAllCustomer();
//		for(Customer customer : customers) {
//			System.out.println(customer);
//		}
	}
	
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading Success");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Fail");
		}
	}
}
