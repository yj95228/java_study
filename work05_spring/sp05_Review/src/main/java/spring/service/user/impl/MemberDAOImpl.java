package spring.service.user.impl;

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
	public static final String NS = "MemberMapper.";
	
	@Override
	public int registerMember(MemberVO vo) throws Exception {
		return sqlSession.insert(NS+"registerMember", vo);
	}

	@Override
	public int deleteMember(String id) throws Exception {
		return sqlSession.delete(NS+"deleteMember", id);
	}

	@Override
	public int updateMember(MemberVO vo) throws Exception {
		return sqlSession.update(NS+"updateMember", vo);
	}

	@Override
	public MemberVO getMember(String id) throws Exception {
		return sqlSession.selectOne(NS+"getMember", id);
	}

	@Override
	public List<MemberVO> showAllMember() throws Exception {
		return sqlSession.selectList(NS+"showAllMember");
	}

	@Override
	public String idExist(String id) throws Exception {
		return sqlSession.selectOne(NS+"idExist", id);
	}

}
