package mybatis.services.user.impl;

import java.sql.SQLException;
import java.util.List;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;
import mybatis.services.user.UserService;

public class MyBatisUserServiceImpl12 implements UserService{

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void addUser(User user) throws SQLException {
		userDAO.addUser(user);
	}

	@Override
	public void updateUser(User user) throws SQLException {
		userDAO.updateUser(user);
	}

	@Override
	public User getUser(String user) throws SQLException {
		return userDAO.getUser(user);
	}

	@Override
	public List<User> getUserList(User user) throws SQLException {
		return userDAO.getUserList(user);
	}

}
