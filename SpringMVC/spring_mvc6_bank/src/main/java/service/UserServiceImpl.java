package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserDao;
import pojo.LogIn;
import pojo.User;

@Service
public class UserServiceImpl implements IUserSer {

	@Autowired
	IUserDao userDao;
	
	public int addUser(User user) {
		
		return this.userDao.add_user_db(user);
	}

	public User validateUser(LogIn login) {
		User user=userDao.validate_user(login);
		return user;
	}

}
