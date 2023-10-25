package com.edu.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.edu.dao.CustomerDAO;
import com.edu.exception.DuplicateIDException;
import com.edu.exception.RecordNotFoundException;
import com.edu.vo.Customer;

import config.ServerInfo;

public class CustomerDAOImpl implements CustomerDAO{
	
	// 싱글톤
	private static CustomerDAOImpl dao = new CustomerDAOImpl();
	private CustomerDAOImpl() {}
	public static CustomerDAOImpl getInstance() {
		return dao;
	};
	
	// 모든 비즈니스 로직마다 공통적으로 들어가는 로직
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
		System.out.println("DB connection Success");
		return conn;
	}
	
	public void closeAll(Connection conn, PreparedStatement ps) throws SQLException{
		if (ps != null) ps.close();
		if (conn != null) conn.close();
	}
	
	public void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException{
		if (rs != null) rs.close();
		closeAll(conn, ps);
	}
	
	private boolean idExist(int id, Connection conn) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT id FROM customer WHERE id = ?";
		ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		
		rs = ps.executeQuery();
		return rs.next();
	}
	
	// 비즈니스 로직
	@Override
	public void addCustomer(Customer vo) throws SQLException, DuplicateIDException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnect();
			if(!idExist(vo.getId(), conn)) {
				String query = "INSERT INTO customer(id, name, address) VALUES (?, ?, ?)";
				ps = conn.prepareStatement(query);
				ps.setInt(1, vo.getId());
				ps.setString(2, vo.getName());
				ps.setString(3, vo.getAddress());
				
				System.out.println(vo.getName()+"님, "+ps.executeUpdate()+" 명 회원 가입 성공");
			}else {
				throw new DuplicateIDException("이미 등록된 고객입니다");
			}
		}
		finally {
			closeAll(conn, ps);
		}
	}

	@Override
	public void deleteCustomer(int id) throws SQLException, RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnect();
			if(idExist(id, conn)) {
				String query = "DELETE customer WHERE id = ?";
				ps = conn.prepareStatement(query);
				ps.setInt(1, id);
				
				System.out.println(ps.executeUpdate()+" 명 삭제 성공");
			}else {
				throw new RecordNotFoundException("존재하지 않는 고객입니다");
			}
		}
		finally {
			closeAll(conn, ps);
		}
	}

	@Override
	public void updateCustomer(Customer vo) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnect();
			
			String query = "UPDATE customer SET name = ?, address = ? WHERE id = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddress());
			ps.setInt(3, vo.getId());
			
			System.out.println(ps.executeUpdate()+" 명 "+vo+"으로 수정 성공");
		}
		finally {
			closeAll(conn, ps);
		}
	}

	@Override
	public Customer getCustomer(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer customer = null;
		
		try {
			conn = getConnect();
			
			String query = "SELECT id, name, address FROM customer WHERE id = ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				customer = new Customer(id, rs.getString("name"), rs.getString("address"));
			}
			System.out.println(customer);
		}
		finally {
			closeAll(conn, ps, rs);
		}
		return customer;
	}

	@Override
	public ArrayList<Customer> getAllCustomer() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			conn = getConnect();
			
			String query = "SELECT id, name, address FROM customer";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				customers.add(new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("address")));
			}
		}
		finally {
			closeAll(conn, ps, rs);
		}
		return customers;
	}

}
