package com.service.spring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.ItemDAO;
import com.service.spring.domain.Item;

@Service
public class ItemCatalogImpl implements ItemCatalog{

	@Autowired
	private ItemDAO itemDAO;
	
	@Override
	public List<Item> getItemList() throws SQLException {
		return itemDAO.getItemList();
	}

	@Override
	public Item getItem(Integer itemId) throws SQLException {
		return itemDAO.getItem(itemId);
	}
	
}
