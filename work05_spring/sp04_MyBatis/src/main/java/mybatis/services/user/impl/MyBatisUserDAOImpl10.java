package mybatis.services.user.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;

public class MyBatisUserDAOImpl10 implements UserDAO{

	private SqlSession sqlSession;
	public static final String MAPPER_NAME = "UserMapper10.";
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int addUser(User user) throws SQLException {
		int result = sqlSession.insert(MAPPER_NAME+"addUser", user);
		sqlSession.commit();
		return result;
	}

	@Override
	public int updateUser(User user) throws SQLException {
		int result = sqlSession.update(MAPPER_NAME+"updateUser", user);
		sqlSession.commit();
		return result;
	}

	@Override
	public int removeUser(String userId) throws SQLException {
		int result = sqlSession.delete(MAPPER_NAME+"removeUser", userId);
		sqlSession.commit();
		return result;
	}

	@Override
	public User getUser(String userId) throws SQLException {
		User result = sqlSession.selectOne(MAPPER_NAME+"getUser", userId);
		return result;
	}

	@Override
	public List<User> getUserList(User user) throws SQLException {
		List<User> result = sqlSession.selectList(MAPPER_NAME+"getUserList", user);
		return result;
	}

}
