package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean-config.xml");

		 Employee employee1=(Employee)context.getBean("emp2");

		 employee1.show();
	}

}
