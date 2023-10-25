package com.edu.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.edu.exception.DuplicateIDException;
import com.edu.exception.RecordNotFoundException;
import com.edu.vo.Customer;

// 비즈니스 로직 Template
// 비즈니스 로직 -> DB Access하는 로직
public interface CustomerDAO {
	
	// CRUD
	void addCustomer(Customer vo) throws SQLException, DuplicateIDException;
	void deleteCustomer(int id) throws SQLException, RecordNotFoundException;
	void updateCustomer(Customer vo) throws SQLException;
	
	Customer getCustomer(int id) throws SQLException;
	ArrayList<Customer> getAllCustomer() throws SQLException;
}
