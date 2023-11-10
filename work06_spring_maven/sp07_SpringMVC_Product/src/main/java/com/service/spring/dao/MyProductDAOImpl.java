package com.service.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.domain.MyProduct;

@Repository
public class MyProductDAOImpl implements MyProductDAO{

	@Autowired
	private SqlSession sqlSession;
	public static final String NS = "ProductMapper.";
	
	@Override
	public int addProduct(MyProduct vo) throws Exception {
		return sqlSession.insert(NS+"addProduct", vo);
	}
	
	@Override
	public List<MyProduct> findProductByName(String name) throws Exception {
		return sqlSession.selectList(NS+"findProducts", name);
	}

	@Override
	public List<MyProduct> findProductByMaker(String maker) throws Exception {
		return sqlSession.selectList(NS+"findProducts", maker);
	}

	@Override
	public List<MyProduct> findProducts() throws Exception {
		return sqlSession.selectList(NS+"findProducts");
	}

}
