package tester;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.app.Student;
import com.config.StudentConfig;



public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext context=new ClassPathXmlApplicationContext("bean-config.xml");
//
//		 Student student=context.getBean("student",Student.class);
//      
//		 System.out.println(student);
		

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);

		 Student student=context.getBean("getStudent",Student.class);
      
		 System.out.println(student);
		 
		 context.close();
	}

}
