package com.app.Dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.app.pojo.Student;

public class StudentDao implements IStudentDao {
	

	private HibernateTemplate hibernateTemp;

	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		this.hibernateTemp = hibernateTemp;
	}

	//Save the Student into Database
	@Transactional
	public int insertData(Student student) {
		
		Integer res=(Integer)this.hibernateTemp.save(student);
		
		return res;
	}

	
}
