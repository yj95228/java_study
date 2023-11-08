package mybatis.services.user.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;
import mybatis.services.user.UserService;

@Service
public class MyBatisUserServiceImpl13 implements UserService{

	@Autowired
	private UserDAO userDAO;

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
