package spring.service.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import spring.service.domain.MemberVO;

public interface MemberDAO {	
	int registerMember(MemberVO vo) throws SQLException;
	int deleteMember(String id) throws SQLException;
	int updateMember(MemberVO vo) throws SQLException;
	List<MemberVO> showAllMember() throws SQLException;
	MemberVO getMember(String id) throws SQLException;
	String idExist(String id) throws SQLException;
	MemberVO login(MemberVO vo) throws SQLException;
}
