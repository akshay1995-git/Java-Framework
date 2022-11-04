package dao;

import pojo.LogIn;
import pojo.User;

public interface IUserDao {

	public int add_user_db(User user);

	public User validate_user(LogIn login);
	
	
}
