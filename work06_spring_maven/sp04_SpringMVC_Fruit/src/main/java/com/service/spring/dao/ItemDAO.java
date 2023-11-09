package com.service.spring.dao;

import java.sql.SQLException;
import java.util.List;

import com.service.spring.domain.Item;

public interface ItemDAO {
	List<Item> getItemList() throws SQLException;
	Item getItem(Integer itemId) throws SQLException;
}
