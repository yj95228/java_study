package com.edu.bank;

public class Account {
	private int accNumber;
	private String bankName;
	private double balance;
	
	public Account(int accNumber, String bankName, double balance) {
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public String getBankName() {
		return bankName;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getDetails() {
		return accNumber+", "+bankName;
	}
	
	//입출금
	public void deposit(double amt) {
		if(amt >= 1000) {
			balance += amt;			
		}else {
			System.out.println("입금액은 1,000원부터 가능합니다");
			return;
		}
	}
	public void withdraw(double amt) {
		if (balance < amt) {
			System.out.println("출금 불가");
			return;
		}
		balance -= amt;			
	}
}
