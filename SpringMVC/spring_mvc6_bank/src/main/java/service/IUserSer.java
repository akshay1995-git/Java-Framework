package service;

import pojo.LogIn;
import pojo.User;

public interface IUserSer {

	public int addUser(User user);
	
	public User validateUser(LogIn login);
}
