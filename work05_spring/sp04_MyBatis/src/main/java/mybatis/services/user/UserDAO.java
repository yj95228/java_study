package mybatis.services.user;

import java.sql.SQLException;
import java.util.List;

import mybatis.services.domain.User;

// 비즈니스 로직 기능의 Template
/*
 * mapping10.xml에서
 * 쿼리문의 id가 함수명으로
 * parameterType이 함수의 인자값으로
 * resultmap이 함수의 return타입으로 연결
 */
public interface UserDAO {
	int addUser(User user) throws SQLException;
	int updateUser(User user) throws SQLException;
	int removeUser(String user) throws SQLException;
	
	User getUser(String user) throws SQLException;
	List<User> getUserList(User user) throws SQLException;
}
