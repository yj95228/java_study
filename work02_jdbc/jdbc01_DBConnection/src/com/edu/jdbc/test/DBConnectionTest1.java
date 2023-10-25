package com.edu.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionTest1 {
	public DBConnectionTest1() {
		try {
			// 1. Driver 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success");
			
			// 2. DB 서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";	// protocol:@ip:port
			String user = "scsa";
			String password = "1234";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connection Success");
			
			// 3. 쿼리문 작성
			/*
			String query = "INSERT INTO customer(id, name, address) VALUES(?, ?, ?)";
			
			// 4. PreparedStatement 객체 생성
			PreparedStatement ps = conn.prepareStatement(query); // pstmt
			System.out.println("PreparedStatement Created");
			
			// 5. ?에 값을 바인딩
			ps.setInt(1, 555);
			ps.setString(2, "Jane1");
			ps.setString(3, "Brandon1");
			
			// 6. 쿼리문 실행
			int row = ps.executeUpdate();
			System.out.println(row+" ROW INSERT");
			*/
			
			// DELETE
			/*
			String query = "DELETE customer WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, 444);
			
			int row = ps.executeUpdate();
			System.out.println(row+" ROW DELETE");
			*/
			
			// UPDATE
			String query = "UPDATE customer SET name = ?, address = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, "James");
			ps.setString(2, "LA");
			ps.setInt(3, 111);
			
			int row = ps.executeUpdate();
			System.out.println(row+" ROW UPDATE");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Fail");
		} catch (SQLException e) {
			System.out.println("DB Connection Fail");
		}
	}
	
	public static void main(String[] args) {
		new DBConnectionTest1();
	}

}
