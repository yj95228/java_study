package com.edu.bank;

import java.util.ArrayList;

// 은행에서 통장을 개설하는 고객
public class Customer {
	private int ssn;
	private String custName;
	
	// Has a Relation
//	private Account account;
	private ArrayList<Account> accounts;

	public Customer(int ssn, String custName) {
		this.ssn = ssn;
		this.custName = custName;
	}
	
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//
//	public Account getAccount() {
//		return account;
//	}
	
	public String getCustomerInfo() {
		return ssn+", "+custName;
	}
	
	
}
