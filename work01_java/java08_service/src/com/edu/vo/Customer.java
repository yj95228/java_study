package com.edu.vo;

import java.util.ArrayList;

// 아울렛에서 상품을 구매하는 고객
public class Customer {
	private int ssn;
	private String name;
	private String address;
	
	private ArrayList<Product> products;

	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void buyProducts(ArrayList<Product> products) {
		this.products = products;
	}
	

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void changeAddress(String address) {
		this.address = address;
	}
}
