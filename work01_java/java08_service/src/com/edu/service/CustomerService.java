package com.edu.service;

import java.util.ArrayList;

import com.edu.vo.Customer;
import com.edu.vo.Product;

// 상품을 구매하는 고객의 기능들을 모아놓은 클래스 (서비스 클래스)
public class CustomerService {
	// 1. 특정 고객이 구입한 모든 상품을 반환하는 기능 
	// 함수명, 리턴타입, 인자값
	public ArrayList<Product> getAllProduct(ArrayList<Customer> custs, int ssn){
		ArrayList<Product> temp = new ArrayList<>();
		for(Customer cust: custs) {
			if(ssn == cust.getSsn())
				temp = (ArrayList<Product>) cust.getProducts();
		}
		return temp;
	}
	
	// 2. 특정 고객이 구입한 상품들의 maker들만 리턴
	public ArrayList<String> getAllMaker(ArrayList<Customer> custs, int ssn){
		ArrayList<String> temp = new ArrayList<>();
		for(Customer cust: custs) {
			if(ssn == cust.getSsn()) {
				ArrayList<Product> products = cust.getProducts();
				for (Product prod : products) temp.add(prod.getMaker());
				break;
			}
		}
		return temp;
	}
	
	// 3. 모든 고객 중에서 특정 고객을 찾아서 반환하는 기능
	public Customer findCustomerBySsn(ArrayList<Customer> custs, int ssn) {
		Customer customer = null;
		for(Customer cust: custs) {
			if(ssn == cust.getSsn()) {
				customer = cust;
				break;
			}
		}
		return customer;
	}
	
	// 메소드 오버로딩
	/* -> 하는 일은 같지만 처리하는 데이터를 다르게
	  1. 함수명은 반드시 똑같아야 함
	  2. arguments 리스트는 달라야 함
	  3. return 타입은 can differ (상관 없다)
	 */
	// 4. 모든 고객 중에서 특정 고객(같은 동네에 사는)을 찾아서 반환하는 기능
	public ArrayList<Customer> findCustomer(ArrayList<Customer> custs, String addr) {
		ArrayList<Customer> temp = new ArrayList<>();
		for(Customer cust: custs) {
			if(cust.getAddress().equals(addr)) {
				temp.add(cust);
			}
		}
		return temp;
	}
}
