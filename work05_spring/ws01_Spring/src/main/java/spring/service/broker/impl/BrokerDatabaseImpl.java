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
		ArrayList<Customer> c = new ArrayList<Customer>();
		System.out.println("전체 고객 정보 조회");
		c.add(new Customer("1", "2", "3"));
		return c;
	}

	@Override
	public ArrayList<Stock> getAllStock() {
		ArrayList<Stock> s = new ArrayList<Stock>();
		System.out.println("전체 주식 정보 조회");
		s.add(new Stock("4", 5));
		return s;
	}

}
