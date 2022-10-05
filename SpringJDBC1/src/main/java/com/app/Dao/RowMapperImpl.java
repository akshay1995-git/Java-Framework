package com.app.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	
	public RowMapperImpl() {
		// TODO Auto-generated constructor stub
	}

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setCompany_name(rs.getString(3));
		return emp;
	}

}
