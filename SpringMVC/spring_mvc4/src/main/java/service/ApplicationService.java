package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ApplicationDao;
import pojo.Application;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationDao appDao;
	
	public int addApplication(Application application) {
		int result=this.appDao.saveApplication(application);
		return result;
	}
	
	public int retrieveApplication(String email,String password) {
		int result=this.appDao.returnAppdetail(email,password);
		return result;
	}
}
