package jdbc.test;

import java.util.ArrayList;

import config.ServerInfo;
import jdbc.dao.impl.MemberDAOImpl;
import jdbc.exception.DuplicateIDException;
import jdbc.exception.RecordNotFoundException;
import jdbc.vo.Member;

public class MemberDAOTest {
	
	public static void main(String[] args)throws Exception {
	
		MemberDAOImpl dao = MemberDAOImpl.getInstance();
		try {
			dao.insertMember(new Member("AAA", "aaa@google.com", 123));			
		}catch(DuplicateIDException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			dao.deleteMember(111222);			
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dao.updateMember(new Member("AAA", "aaa@google.com", 111222));			
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			dao.getMember(111222);			
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			ArrayList<Member> members = dao.getMember("aaa@google.com");
			for(Member m : members) {
				System.out.println(m);
			}			
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		ArrayList<Member> allMembers = dao.getMember();
		for(Member m : allMembers) {
			System.out.println(m);
		}
	}
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading...Success...");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading...Fail...");
		}
	}
}
