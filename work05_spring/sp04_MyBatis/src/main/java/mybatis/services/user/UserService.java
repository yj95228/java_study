package mybatis.services.user;

import java.sql.SQLException;
import java.util.List;

import mybatis.services.domain.User;

// 데이터 가공 레이어
public interface UserService {
	void addUser(User user) throws SQLException;
	void updateUser(User user) throws SQLException;
	
	User getUser(String user) throws SQLException;
	List<User> getUserList(User user) throws SQLException;
}
