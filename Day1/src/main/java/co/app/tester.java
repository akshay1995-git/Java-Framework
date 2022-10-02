package co.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class tester {

	public static void main(String[] args) {
	System.out.println("Hello Spring");
	//context is  is object of Spring container and this SC manages bean i.e Student bean
	// all member of student class are set in bean-config.XML file 
	
	/*
	 * ClassPathApplicationContext is spring class which imlements ApplicationContext interface 
	 * which is used to load bean configuration xml file from the class path
	 */
	ApplicationContext context= new ClassPathXmlApplicationContext("bean_config.xml");
	//getBean method con Context class  will return instance of registered bean object
	Student obj1=(Student)context.getBean("student1");//context.getBean("student1",Student.class)--->no need to typecast
	Student obj2=(Student)context.getBean("student2");
	System.out.println(obj1);
	System.out.println(obj2);

	}

 
}
