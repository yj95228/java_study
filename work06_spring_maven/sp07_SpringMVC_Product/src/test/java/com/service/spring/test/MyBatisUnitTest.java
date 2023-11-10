package com.service.spring.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.service.spring.domain.MyProduct;

public class MyBatisUnitTest {
	
	@Test
	public void unit() throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		
		System.out.println("=== ADDPRODUCT ===");
		
//		MyProduct vo = new MyProduct("파워펑펑 세탁기", "삼성", 1200000);
//		session.insert("ProductMapper.addProduct", vo);
//		session.commit();
//		System.out.println("insert OK"+vo);
		
		System.out.println("=== FINDPRODUCT ===");
		
		List<MyProduct> list = session.selectList("ProductMapper.findProducts", "삼성");
		System.out.println(list);
	}
}
