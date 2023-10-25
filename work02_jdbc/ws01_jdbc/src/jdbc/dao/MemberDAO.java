package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.exception.DuplicateIDException;
import jdbc.exception.RecordNotFoundException;
import jdbc.vo.Member;

public interface MemberDAO {

	Connection getConnect() throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps)throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps, ResultSet rs)throws SQLException;
	
	void insertMember(Member vo) throws SQLException, DuplicateIDException;
	void deleteMember(int phone) throws SQLException, RecordNotFoundException;
	void updateMember(Member vo) throws SQLException, RecordNotFoundException;
	
	Member getMember(int phone) throws SQLException, RecordNotFoundException;
	ArrayList<Member> getMember(String address) throws SQLException, RecordNotFoundException;
	ArrayList<Member> getMember() throws SQLException;
}
