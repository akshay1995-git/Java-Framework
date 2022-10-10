package tester;

import static utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import pojo.Student;

public class FetchData {

	public static void main(String[] args) {
		try(SessionFactory sf= getSf())
		{
			System.out.println("hibernate up n running! "+sf);
			Session session=sf.openSession();
			//No need Transaction because we dont need to persist data we just fetch data
			//get method of Session will fetch Student Data from Database by primary key ---session.get(Class,Id);
			Student student1=(Student)session.get(Student.class,102);
			System.out.println(student1);
			//load method
			Student student2=(Student)session.load(Student.class,101);
			System.out.println(student2);
			/*
			 * Differnece 
			 * get() and load() are two methods which is used to fetch data for the given identifier.
			 *  They both belong to Hibernate session class. Get() method return null, 
			 *  If no row is available in the session cache or the database for the given identifier 
			 *  whereas load() method throws object not found exception.
			 */
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
