package com.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.app.Employee;

public class TestMain {

	public static void main(String[] args) {
		
  ApplicationContext context=new ClassPathXmlApplicationContext("bean-config.xml");
  Employee employee1=(Employee)context.getBean("employee1");
  System.out.println(employee1);
  
	}

}
