package com.app.SpringJDBC1;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.Dao.EmployeeDaoImpl;
import com.app.Dao.IEmployeeDao;
import com.app.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/app/SpringJDBC1/jdbc-config.xml");

	//	JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);

		IEmployeeDao empDao=context.getBean("empDao",EmployeeDaoImpl.class);
		Scanner sc=new Scanner(System.in);

		/*--------------------insertuing data--------
		System.out.println("Enter a employee data to insert : ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID--Name-Company--");
		Employee emp=new Employee(sc.nextInt(),sc.next(),sc.next());
		int result=empDao.insertDetail(emp);
		System.out.println("Data inserted "+result);
		/*---------------updating Data-----------
		System.out.println("Update company name of Employe : ");
		Employee emp1=new Employee();
		System.out.println("Enter a ID of employee ? ");
	   emp1.setId(sc.nextInt());
		System.out.println("Enter a new Company name :");
		emp1.setCompany_name(sc.next());
		int result1=empDao.updateCompany(emp1);
		System.out.println("Data Updated "+result1);

		/*------------delete Records---------------------
		System.out.println("Enter a employee ID to delete records :");
		//Employee emp2=new Employee();
	
		int result2=empDao.deleteRecord(sc.nextInt());
		System.out.println("Data Updated "+result2);
		
		----------Retrieve  Record from table-----------------*/
		System.out.println("Enter a Id to fetch detail ? ");
		Employee emp_data=empDao.retrieveData(sc.nextInt());
		System.out.println(emp_data);
		/*-------------------Retrieve All employee Data-----------*/
		System.out.println("All Data from Employee table ");
		List<Employee> emp_list=empDao.gelAllData();
		for(Employee e:emp_list) {
			System.out.println(e);
		}
		sc.close();
		context.close();
	}
}
