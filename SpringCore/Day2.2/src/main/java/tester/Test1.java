package tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean-config.xml");

		 Employee employee1=(Employee)context.getBean("emp1");

		 employee1.show();
	}

}
