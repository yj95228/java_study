package spring.service.broker;

import java.util.ArrayList;

import spring.service.customer.Customer;
import spring.service.stock.Stock;

public interface BrokerDatabase {
	void registerCustomer(Customer customer);
	void registerStock(Stock stock);
	ArrayList<Customer> getAllCustomer();
	ArrayList<Stock> getAllStock();
}
