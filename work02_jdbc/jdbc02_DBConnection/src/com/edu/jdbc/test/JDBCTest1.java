package com.edu.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;

/*
 * SQL DML(INSERT/DELETE/UPDATE) + SELECT
 * 
 * 1. Driver Loading
 * 2. DB 연결 (connection)
 * 3. PreparedStatement
 * 4. 데이터 바인딩
 * 5. 쿼리문 실행
 */
public class JDBCTest1 {
	public JDBCTest1() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
			System.out.println("DB Connection Success");
			
			// UPDATE
			/*
			String query = "UPDATE customer SET name=?, address=? WHERE id=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, "Jane1");
			ps.setString(2, "Brandon1");
			ps.setInt(3, 333);
			System.out.println(ps.executeUpdate()+" 명 수정 성공");
			*/
			
			// SELECT
			String query = "SELECT id, name, address FROM customer";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				System.out.println(id+"\t"+name+"\t"+address);
			}
			
			
		}catch(SQLException e) {
			System.out.println("DB Connection Fail");
		}
	}
	public static void main(String[] args) {
		new JDBCTest1();

	}
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading Success");
		}catch(ClassNotFoundException e){
			System.out.println("Driver Loading Fail");
		}
	}
}
