package com.service.spring.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.test.context.ContextConfiguration;

import com.service.spring.domain.UserInfo;

@MybatisTest
@ContextConfiguration(locations = {"classpath:config/SqlMapConfig.xml"})
public class MyBatisUnitTest {

	@Test
	public void unit() throws Exception{
		
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		//1. SqlSessionFactory -- SqlSessionFactoryBean
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);

	    //2. SqlSession -- SqlSessionTemplate
		SqlSession session=factory.openSession();
		
		UserInfo user = new UserInfo("admin", "admin");
		UserInfo vo = session.selectOne("sql.pms.mapper.selectUser", user);
		System.out.println("LOGIN "+vo);
	}

}
