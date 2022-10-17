package daos;

import java.util.List;

import pojos.User;

public interface IUserDao {
//Insert User-Add user
	public int addUser(User user);

//Delete User
	public void deleteUser(int id);

//Update User Reg-Amount based on Id
	public int updateAmount(int id);
//Update User based on name

	// Retrieve All Data
public List<User> getAllUser();

//retrieve user based on id
public User getUserbyId(int id);
//retrieve user based on email
public User getUserByEmail(String email);

}
