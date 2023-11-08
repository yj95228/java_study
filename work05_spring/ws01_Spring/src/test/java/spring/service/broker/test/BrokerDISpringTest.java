package spring.service.broker.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.broker.BrokerDatabase;
import spring.service.broker.impl.BrokerDatabaseImpl;
import spring.service.customer.Customer;
import spring.service.stock.Stock;

public class BrokerDISpringTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/service.xml");
		
		Customer c1 = (Customer) factory.getBean("customer01");
		Customer c2 = (Customer) factory.getBean("customer02");
		Stock s1 = (Stock)factory.getBean("stock01");
		Stock s2 = (Stock)factory.getBean("stock02");
		BrokerDatabase brokerDb = (BrokerDatabase) factory.getBean("dao");
		
		brokerDb.registerCustomer(c1);
		brokerDb.registerCustomer(c2);
		brokerDb.registerStock(s1);
		brokerDb.registerStock(s2);
		
		for (Customer c: brokerDb.getAllCustomer()) {
			System.out.println(c);
		}
		
		for (Stock s: brokerDb.getAllStock()) {
			System.out.println(s);
		}
		
	}

}
