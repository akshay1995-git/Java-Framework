package utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class HibernateUtils {
private static SessionFactory sf;
static {
	/*
	 * Configuration cfg=new Configuration();
	 * cfg.configure();------>configure("hibernate.cfg.xml")//to configure our xml file 
	 *Note :in actual we dont mention file because our file is in correct position no need to mention
	 *but if we move our file in some other folder need to mention absolute path exp;"com/app/hibernate.cfg.xml"
	 * SessionFactory factory=cfg.buildSessionFactory()
	 */
	try {
	sf=new Configuration().configure().buildSessionFactory();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public static SessionFactory getSf() {
	return sf;
}

}
