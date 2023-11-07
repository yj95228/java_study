package com.service.mybatis.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.service.mybatis.vo.MySawon;

import util.FactoryService;

public class MySawonTest3 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * // 1. MyBatis 핵심설정문서를 읽어들인다 Reader r =
		 * Resources.getResourceAsReader("config/SqlMapConfig.xml");
		 * 
		 * // 2. SqlSessionFactory를 생성 SqlSessionFactory factory = new
		 * SqlSessionFactoryBuilder().build(r);
		 * System.out.println("SqlSessionFactory 생성");
		 */
		
		SqlSessionFactory factory = FactoryService.getFactory();
		
		// 3. SqlSession 생성 - insert/delete/update/selectOne/selectList 함수
		SqlSession session = factory.openSession();
		System.out.println("SqlSession 생성");
		
		// 쿼리문 실행 (sawonMapper의 id가 sawonAdd인 쿼리 실행)
	    MySawon vo = session.selectOne("sawonMapper.getSawon", 3);
		System.out.println(vo);
	}

}
