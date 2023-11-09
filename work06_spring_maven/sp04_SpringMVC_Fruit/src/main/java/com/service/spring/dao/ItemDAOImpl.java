package com.service.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.domain.Item;

@Repository
public class ItemDAOImpl implements ItemDAO{

	@Autowired
	private SqlSession sqlSession;
	public static final String NS = "ns.sql.ItemMapper.";
	
	@Override
	public List<Item> getItemList() throws SQLException {
		return sqlSession.selectList(NS+"getItemList");
	}

	@Override
	public Item getItem(Integer itemId) throws SQLException {
		return sqlSession.selectOne(NS+"getItem", itemId);
	}

}
