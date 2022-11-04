package dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Session;

import pojo.LogIn;
import pojo.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	HibernateTemplate hibernatetemplate;

	@Autowired
	private SessionFactory sf;

	@Transactional
	public int add_user_db(User user) {

		return (Integer) this.hibernatetemplate.save(user);
	}

	@Transactional
	public User validate_user(LogIn login) {
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		User user = (User) this.sf.getCurrentSession().createQuery(jpql, User.class)
				.setParameter("em", login.getEmail()).setParameter("pass", login.getPassword()).getSingleResult();
		return user;

	}

}
