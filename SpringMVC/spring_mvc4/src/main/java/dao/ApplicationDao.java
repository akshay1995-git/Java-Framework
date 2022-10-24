package dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pojo.Application;

@Repository
public class ApplicationDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public int saveApplication(Application app) {
		int result=(Integer) this.hibernatetemplate.save(app);
		return result;
	}
	
	@Transactional
	public int returnAppdetail(String email,String password) {
		
		String jpql="select a from Application a where applicant_email=:email and applicant_password=:password";
	

		//int result=this.hibernatetemplate.createQuery(jpql);
		return 0;
		
	}
}
