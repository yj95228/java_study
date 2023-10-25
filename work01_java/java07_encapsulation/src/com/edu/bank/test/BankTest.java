package com.edu.bank.test;

import java.util.ArrayList;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		
		Customer cust = new Customer(1111, "김삼성");
		
		ArrayList<Account> list = new ArrayList<>();
		list.add(new Account(1, "국민은행", 10000.0));
		list.add(new Account(2, "신한은행", 20000.0));
		list.add(new Account(3, "토스뱅크", 30000.0));
		
		cust.setAccounts(list);
		ArrayList<Account> retList = cust.getAccounts();
		for(int i = 0; i < retList.size(); i++) {
			System.out.println(retList.get(i).getDetails());
		}
		
		for(Account acc: retList) {
			System.out.println(acc.getDetails());
		}
		
		// 1. 김삼성이 개설한 통장 중에서 토스뱅크 통장을 찾아서 5만원 입금
		System.out.println("1. 토스뱅크에 5만원 입금");
		for(Account acc : retList)
			if(acc.getBankName().equals("토스뱅크")) acc.deposit(50000.0);
		
		// 2. 김삼성이 개설한 모든 통장의 총자산을 출력
		System.out.println("2. 총 자산 출력");
		int total = 0;
		for(Account acc: retList)
			total += acc.getBalance();
		System.out.println("총 자산은 "+total+"원 입니다");
		
		// 3. 김삼성이 개설한 통장 중에서 가장 많은 잔고를 가지고 있는 통장의 이름을 출력
		System.out.println("3. 가장 많은 잔고를 가진 통장 이름 출력");
		double max = 0.0;
		String name = null;
		for(Account acc : retList) {
			if(max < acc.getBalance()) {
				max = acc.getBalance();
				name = acc.getBankName();
			}
		}
		System.out.println("가장 많은 잔고를 가진 통장은 "+name+"에 "+max+"원이 있음");
	}

}
