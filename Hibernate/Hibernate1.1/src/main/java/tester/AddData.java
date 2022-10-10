
package tester;
import static utils.HibernateUtils. getSf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;

import pojo.Address;
import pojo.Student;

public class AddData {

	public static void main(String[] args)throws IOException {
		//bootstrapping hib frmwork
		try(SessionFactory sf= getSf())
		{
			System.out.println("hibernate up n running! "+sf);
			
			//creating  object to mapped in database
			Student student1=new Student();
			student1.setStu_Id(104);
			student1.setName("Vivek");
			student1.setCity("Pune");
			student1.setFees(8500);
			System.out.println(student1);
			//Creating Address Object
			Address address=new Address();
			address.setStreet("Shree Road");
			address.setCity("Adarshnagar");
			address.setOpen(true);
			address.setArea(2345);
			address.setDate(new Date());
			//Reading image to add data in database
			//pass image in File input stream
			FileInputStream fis=new FileInputStream("src/main/java/photo.jpg");
			//create byrte array to store image
			byte[] data=new byte[fis.available()];
			//read that byte array
			fis.read(data);
			//set byte array
			address.setImage(data);
			
			
			//creating session and return value of cuurent session
			Session session=sf.getCurrentSession();
			//begin transaction from session 
			Transaction tx=session.beginTransaction();
			//save the state of Entity using session
			session.save(student1);
		   //save address
			session.save(address);
			//commit the transaction
			tx.commit();
			//close the session
			session.close();
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
