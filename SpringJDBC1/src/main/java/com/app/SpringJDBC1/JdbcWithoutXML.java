package com.app.SpringJDBC1;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.app.Dao.EmployeeDaoImpl;
import com.app.Dao.IEmployeeDao;


///////////////// JDBC configuration without XML file -////////////////////////
//no loner jdbc-confix.xml file required 
@Configuration
public class JdbcWithoutXML {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("sairam");

		return ds;

	}

	@Bean("jdbctemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
	}

	@Bean("empDao")
	public IEmployeeDao getEmployeeDao() {
		EmployeeDaoImpl empDao = new EmployeeDaoImpl();
		empDao.setJdbcTemplate(getJdbcTemplate());

		return empDao;
	}

}
