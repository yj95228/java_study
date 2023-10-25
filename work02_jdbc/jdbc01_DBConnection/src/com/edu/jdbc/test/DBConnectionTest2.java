package com.edu.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ServerInfo;

// DB 서버에 대한 정보만을 가지는 메타데이터를 구성 -> 인터페이스
public class DBConnectionTest2 {
	public DBConnectionTest2() {
		try {
			// 1. Driver 로딩
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading Success");
			
			// 2. DB 서버 연결
			String url = ServerInfo.URL;	// protocol:@ip:port
			String user = ServerInfo.USER;
			String password = ServerInfo.PASS;
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
		new DBConnectionTest2();
	}

}
