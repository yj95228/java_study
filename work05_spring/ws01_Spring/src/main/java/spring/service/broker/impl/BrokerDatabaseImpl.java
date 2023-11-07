package spring.service.broker.impl;

import java.util.ArrayList;

import spring.service.broker.BrokerDatabase;
import spring.service.broker.impl.BrokerDatabaseImpl;
import spring.service.customer.Customer;
import spring.service.stock.Stock;

public class BrokerDatabaseImpl implements BrokerDatabase{
	
	public BrokerDatabaseImpl() {}
	
	@Override
	public void registerCustomer(Customer customer) {
		System.out.println(customer.getCustName()+"가 등록되었습니다");
	}

	@Override
	public void registerStock(Stock stock) {
		System.out.println(stock.getSymbol()+"가 등록되었습니다");
	}

	@Override
	public ArrayList<Customer> getAllCustomer() {
		System.out.println("전체 고객 정보 조회");
		return null;
	}

	@Override
	public ArrayList<Stock> getAllStock() {
		System.out.println("전체 주식 정보 조회");
		return null;
	}

}
