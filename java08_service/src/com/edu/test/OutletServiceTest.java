package com.edu.test;

import java.util.ArrayList;

import com.edu.service.CustomerService;
import com.edu.vo.Customer;
import com.edu.vo.Product;

public class OutletServiceTest {

	public static void main(String[] args) {
		ArrayList<Product> products1 = new ArrayList<>();
        products1.add(new Product("신라면", 1200, 10, "농심"));
        products1.add(new Product("삼다수생수", 1200, 2, "농심"));
        products1.add(new Product("옥시크린", 34000, 1, "엘지"));
        products1.add(new Product("I-Phone", 1000000, 1, "애플"));


        ArrayList<Product> products2 = new ArrayList<>();
        products2.add(new Product("새우깡", 1000, 2, "농심"));
        products2.add(new Product("Terra", 5000, 2, "T"));

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(111, "강하늘", "방배동"));
        customers.add(new Customer(222, "화사", "방배동"));

        customers.get(0).buyProducts(products1);
        customers.get(1).buyProducts(products2);

        // 서비스 생성
        CustomerService service = new CustomerService();
        
        // 서비스 기능을 호출
        System.out.println("1. 강하늘님이 구입하신 제품정보");
        ArrayList<Product> pros = service.getAllProduct(customers, 111);
        for (Product p: pros) {
        	System.out.println(p.getDetails());
        }
        
        System.out.println();
        System.out.println("2. 화사님이 구매하신 제품 Maker");
        ArrayList<String> makers = service.getAllMaker(customers, 222);
        for(String maker : makers) {
        	System.out.println(maker);
        }

        System.out.println();
        System.out.println("3. 222 주민번호에 해당하는 고객 찾기");
        Customer customer = service.findCustomerBySsn(customers, 222);
        System.out.println(customer.getName());
        
        System.out.println();
        System.out.println("4. 222 주민번호에 해당하는 고객 찾기");
        ArrayList<Customer> custs = service.findCustomer(customers, "방배동");
        for (Customer c: custs) {
        	System.out.println(c.getAddress()+"에 "+c.getName()+"가 산다");
        }

	}

}
