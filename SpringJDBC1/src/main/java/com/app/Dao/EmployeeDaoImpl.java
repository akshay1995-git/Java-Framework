package com.app.Dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertDetail(Employee emp) {
		String ins_query="insert into emp_tbl(id,name,company_name) values(?,?,?)";
		int result = this.jdbcTemplate.update(ins_query,emp.getId(),emp.getName(),emp.getCompany_name());
		
		return result;
	
	}
//update company from employee Id
	public int updateCompany(Employee emp) {
		String upd_query="update emp_tbl set company_name=? where id=?";
		int result=this.jdbcTemplate.update(upd_query,emp.getCompany_name(),emp.getId());
		return result;
	}

	public int deleteRecord(int e_id) {
		String query="delete from stu_tbl where id=?";
		int result=this.jdbcTemplate.update(query,e_id);
		return result;
	}

	public Employee retrieveData(int emp_id) {
		String query="select * from emp_tbl where id=?";
		RowMapper rowMapper1=new RowMapperImpl();
		Employee emp=this.jdbcTemplate.queryForObject(query,rowMapper1,emp_id);
		return emp;
	}

	public List<Employee> gelAllData() {
		String query="select * from emp_tbl";
		RowMapper rowMapper2=new RowMapperImpl();
		List<Employee> emp_list=this.jdbcTemplate.query(query,rowMapper2);

		return emp_list;
	}

}
