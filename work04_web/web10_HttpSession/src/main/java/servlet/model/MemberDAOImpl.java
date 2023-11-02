package servlet.model;
/*
 * DriverManager 방식이 아닌
 * DataSource방식으로 디비 연결하기..
 * JNDI (Naming) service 사용한다.
 * 이름으로 등록하고 Context.xml
 * 이름으로 찾아오고. InitialContext.java)
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAOImpl implements MemberDAO{
	// 
	private DataSource ds;	
	
	//Singleton 패턴
	private static MemberDAOImpl dao = new MemberDAOImpl();
	

	private MemberDAOImpl() {
		try {
			InitialContext ic = new InitialContext();
			ds = (DataSource)ic.lookup("java:comp/env/jdbc/oracleDB");
			System.out.println("DataSource Lookup Success!!....");

		} catch (NamingException e) {
			System.out.println("DataSource Lookup Fail....");
		}
	}
	public static MemberDAOImpl getInstance() {
		return dao;
	}	
	
	@Override
	public Connection getConnection() throws SQLException {		
		System.out.println("디비연결 성공....");
		return ds.getConnection(); //Connection 하나씩 Pool에서 받아온다..
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();		
		if(conn != null) conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException{		
		if(rs != null)	rs.close();
		closeAll(ps, conn);		
	}

	@Override
	public void registerMember(MemberVO vo) throws SQLException {		
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = getConnection();
			String query = "INSERT INTO member (id, password, name, address) VALUES(?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getAddress());
			
			System.out.println(ps.executeUpdate()+" 명 회원 가입 성공!!");
			
		}finally{
			closeAll(ps, conn);
		}
	}

	@Override
	public ArrayList<MemberVO> showAllMember() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			String query = "SELECT id, password, name, address FROM member";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement....showAllMember()..");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new MemberVO(
						rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("address")));
			}
		}finally {
			closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public MemberVO findByIdMember(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try{
//			conn = getConnection();
//			String query = "SELECT id, password, name, address FROM member WEHRE id=?";
//			ps = conn.prepareStatement(query);
//			ps.setString(1, id);	
//			rs = ps.executeQuery();
//			if (rs.next()) {
//				vo = new MemberVO(id, 
//								rs.getString("password"), 
//								rs.getString("name"),
//								rs.getString("address"));
//			}
			//
			conn = getConnection();
            String query = "SELECT id, password, name, address FROM member WHERE id=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                vo = new MemberVO(id, 
                                  rs.getString("password"), 
                                  rs.getString("name"),
                                  rs.getString("address"));
            }

		}finally{
			closeAll(rs, ps, conn);
		}
		return vo;
	}


//   일종의 dao 단위테스트	
//	public static void main(String[] args)throws Exception{
//		MemberDAOImpl dao=MemberDAOImpl.getInstance();
////		MemberVO VO=dao.findByIdMember("encore");
////		System.out.println(VO);
//		
//		ArrayList<MemberVO> list=dao.showAllMember();
//		System.out.println(list);
//	}
}

















