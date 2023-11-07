package com.service.mybatis.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.service.mybatis.vo.MySawon;

public class MySawonTest1 {

	public static void main(String[] args) throws Exception {
		// 화면으로부터 회원의 정보를 입력받는다
		MySawon vo = new MySawon();
		vo.setId("scsa2");
		vo.setName("길복순2");
		vo.setPwd("1234");
		vo.setAge(55);
		
		// 1. MyBatis 핵심설정문서를 읽어들인다
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		// 2. SqlSessionFactory를 생성
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		System.out.println("SqlSessionFactory 생성");
		
		// 3. SqlSession 생성 - insert/delete/update/selectOne/selectList 함수
		SqlSession session = factory.openSession();
		System.out.println("SqlSession 생성");
		
		// 쿼리문 실행 (sawonMapper의 id가 sawonAdd인 쿼리 실행)
		session.insert("sawonMapper.sawonAdd", vo);
		session.commit();
		
		System.out.println(vo.getName()+"님 회원 등록 성공");
	}

}
