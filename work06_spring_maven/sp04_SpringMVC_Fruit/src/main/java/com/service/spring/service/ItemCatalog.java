package com.service.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.service.spring.domain.Item;

public interface ItemCatalog {
	List<Item> getItemList() throws SQLException;
	Item getItem(Integer itemId) throws SQLException;
}
