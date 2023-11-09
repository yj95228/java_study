package spring.service.user.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.service.domain.MemberVO;
import spring.service.user.MemberDAO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	public static final String MAPPER_NAME = "MemberMapper.";
	
	@Override
	public int registerMember(MemberVO vo) throws SQLException {
		int result = 0;
		if(idExist(vo.getId()) != null) {
			result = sqlSession.insert(MAPPER_NAME+"registerMember", vo);
			sqlSession.commit();
		}
		return result;
	}

	@Override
	public int deleteMember(String id) throws SQLException {
		int result = 0;
		if(idExist(id) != null) {
			result = sqlSession.delete(MAPPER_NAME+"deleteMember", id);
			sqlSession.commit();
		}
		return result;
	}

	@Override
	public int updateMember(MemberVO vo) throws SQLException {
		int result = 0;
		if(idExist(vo.getId()) != null) {
			result = sqlSession.update(MAPPER_NAME+"updateMember", vo);
			sqlSession.commit();
		}
		return result;
	}

	@Override
	public List<MemberVO> showAllMember() throws SQLException {
		return sqlSession.selectList(MAPPER_NAME+"showAllMember");
	}

	@Override
	public MemberVO getMember(String id) throws SQLException {
		MemberVO result = null;
		if(idExist(id) != null) {
			result = sqlSession.selectOne(MAPPER_NAME+"getMember", id);
		}
		return result;
	}

	@Override
	public String idExist(String id) throws SQLException {
		return sqlSession.selectOne(MAPPER_NAME+"idExist", id);
	}

	@Override
	public MemberVO login(MemberVO vo) throws SQLException {
		return sqlSession.selectOne(MAPPER_NAME+"login", vo);
	}

}
