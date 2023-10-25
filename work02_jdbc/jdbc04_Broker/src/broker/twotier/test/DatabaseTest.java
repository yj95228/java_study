package broker.twotier.test;

import java.util.ArrayList;
import java.util.Vector;

import broker.twotier.dao.Database;
import broker.twotier.exception.DuplicateSSNException;
import broker.twotier.exception.RecordNotFoundException;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;

public class DatabaseTest {

	public static void main(String[] args)throws Exception{
		
		Database db = new Database("127.0.0.1");
		
		// 회원 추가
//		try {
//			db.addCustomer(new CustomerRec("999-999", "James", "NY"));
//		}catch(DuplicateSSNException e) {
//			System.out.println(e.getMessage());
//		}
		
		// 회원 삭제
//		try {
//			db.deleteCustomer("888-888");			
//		}catch(RecordNotFoundException e){
//			System.out.println(e.getMessage());
//		}
		
		// 회원 정보 수정
//		try {
//			db.updateCustomer(new CustomerRec("999999", "James1", "NY1"));			
//		}catch(RecordNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		
		// 111-111 회원의 주식 보유 정보
//		ArrayList<SharesRec> v = db.getPortfolio("111-111");
//		for(SharesRec sr : v)System.out.println(sr);
		
		// 999-999 회원 정보
		System.out.println(db.getCustomer("111-111"));
		
		// 전체 회원 정보
//		ArrayList<CustomerRec> v2 = db.getAllCustomers();
//		for(CustomerRec cr : v2)System.out.println(cr);
	}

}
