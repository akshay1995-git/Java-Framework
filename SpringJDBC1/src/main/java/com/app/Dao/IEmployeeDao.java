package com.app.Dao;

import java.util.List;

import com.app.pojo.Employee;

public interface IEmployeeDao {

	public int insertDetail(Employee emp);
	
	public int updateCompany(Employee emp);
	
	public int deleteRecord(int id);
	
	public Employee retrieveData(int emp_id);
	
	public List<Employee> gelAllData();
}
