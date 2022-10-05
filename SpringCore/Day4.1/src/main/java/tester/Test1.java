package tester;
import com.app.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean-config.xml");
		
		//Employee employee1=(Employee)context.getBean("emp");//need to typecast
		 Employee employee1=context.getBean("emp",Employee.class);//no need to typecast
        //emp is ref of  @Component class 
		 employee1.show();
		 System.out.println(employee1);
	}

}
