package daos;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import pojos.User;

public class UserDaoImpl implements IUserDao {

	private HibernateTemplate hibernateTemplate;
	private SessionFactory session;
	Scanner sc=new Scanner(System.in);
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional 
	public int addUser(User user) {
		
		Integer result=(Integer)this.hibernateTemplate.save(user);
		return result;
		
	}

	@Override
	public void deleteUser(int id) {
		User user=this.hibernateTemplate.get(User.class,id);
		this.hibernateTemplate.delete(user);
	
		
	}

	@Override
	@Transactional
	public int updateAmount(int id) {
		User user=this.hibernateTemplate.get(User.class,id);
		
		if(user!=null) {
			//String jpql="update User u set u.name=:name where u.user_id=:id";
			System.out.println("Enter Reg-amount ");
			user.setRegAmount(sc.nextDouble());
			this.hibernateTemplate.saveOrUpdate(user);
			
		
			return 1;
		}
		else {
			return 0;
		}
	
		
	}

	@Override
	public List<User> getAllUser() {
		List<User> list=this.hibernateTemplate.loadAll(User.class);
	
		
		return list;
	}

	@Override
	public User getUserbyId(int id) {
		User user=this.hibernateTemplate.get(User.class,id);
		return user;
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUserByEmail(String email) {
		
		//User user=this.hibernateTemplate
//		String jpa="select User u where u.email=:email";
//		String hql="select * from User where email=?";
//		
//		User user=(User) this.hibernateTemplate.findByNamedParam(hql, email,User.class);
		return null;
	}
	

}
