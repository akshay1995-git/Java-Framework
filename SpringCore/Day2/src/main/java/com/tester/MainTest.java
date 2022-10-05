package com.tester;
import org.springframework.beans.factory.BeanFactory;  
//import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
import com.app.Employee;

public class MainTest {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");  
		
		BeanFactory factory=new XmlBeanFactory(resource);  

		 Employee employee1=(Employee)factory.getBean("factory");  
		 System.out.println(employee1);
	}

}
