package spring.service.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.domain.MemberVO;
import spring.service.user.impl.MemberDAOImpl;
import spring.service.user.impl.MemberServiceImpl;


/*
 * FileName : MyBatisTestApp13.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping10.xml
  * ㅇ userService13.xml 
  * ㅇ Annotation 기반 설정 Test
  */
public class MyBatisMemberTestApp {
	///Main method
	public static void main(String[] args) throws Exception{

		SqlSession session = null;
		//==> TestUtil 의 getSqlSessionFactory()을 이용 SqlSessionFactory instance GET
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		session=factory.openSession();
		
		/*
		 * //==> MemberDAOImpl 생성 및 SqlSession 객체 setter injection MemberDAOImpl dao =
		 * new MemberDAOImpl(); dao.setSqlSession(session);
		 * 
		 * //==> MemberServiceImpl 생성 및 MemberDAOImpl 객체 setter injection
		 * MemberServiceImpl memberService = new MemberServiceImpl();
		 * memberService.setMemberDAO(dao); 
		 */
		
		//0. MemberServiceImpl.registerMember Test  
		System.out.println(":: 0. idExist()  ? ");
		System.out.println("111 : "+session.selectOne("idExist", "111"));
		System.out.println("1111 : "+session.selectOne("idExist", "1111"));
		
		//==> Test 용 User instance 생성  
		MemberVO member = new MemberVO("111","111","111","111");
		//1. MemberServiceImpl.registerMember Test  
		System.out.println(":: 1. registerMember(INSERT)  ? ");
		// System.out.println("등록 잘 되었는지 : "+session.insert("registerMember", member));
		session.commit();
		
		//2. MemberServiceImpl.getMember Test :: 111 inert 확인 
		System.out.println(":: 2. getMember(SELECT)  ? \n " + session.selectOne("getMember", member.getId()) );

		
		//3. MemberServiceImpl.updateMember Test  
		//                                                    :: 111 ==> 123 수정
		member.setName("123");
		System.out.println(":: 3. update(UPDATE)  ? ");
		session.update("updateMember", member) ;
		session.commit();
		
		//4. MemberServiceImpl.showAllMember Test
		System.out.println(":: 4. showAllMember(SELECT)  ? ");
		session.selectList("showAllMember");
		
		//5. MemberServiceImpl.login Test 
		System.out.println(":: 5. login(SELECT)  ? ");
		session.selectOne("login", member);
		
		//6. MemberServiceImpl.removeUser Test
		//==> UserService 에는 removeUser가 없으므로, DAO에서 직접 호출 Test
		System.out.println(":: 6. Use10.deleteMember (DELETE)  ? ");
		session.delete("deleteMember", member.getId());
		session.commit();
	}//end of main
}//end of class