package templatemethod.sample2;

import java.sql.ResultSet;
import java.sql.SQLException;

import templatemethod.sample2.dependency.User;

public class UserDAOJDBCImpl extends AbstractDAO {

	public User findUser(String username, String password) throws Exception {
		String sql = "select user_id,user_name,user_password,user_birthday from UserTable where user_name = ? and user_password = ?";
		Object[] params = { username, password };
		return (User) super.find(sql, params);
	}

	public Object mappingResultSet(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("user_id"));
		user.setUsername(rs.getString("user_name"));
		user.setPassword(rs.getString("user_password"));
		user.setBirthday(rs.getDate("user_birthday"));
		return user;
	}

}
