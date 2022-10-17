package com.app.SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Dao.StudentDao;
import com.app.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/app/SpringORM/spring-config.xml");
       
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
       
       Student student=new Student(101,"Akshay","Ahmednagar");
       
//       student.setId(101);
//       student.setName("Akshay");
//      student.setCity("Ahmednagar");	   
       int r=studentDao.insertData(student);
       System.out.println("rows afftected "+r);
       
       
       
       context.close();
    }
}
