package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import daos.UserDaoImpl;
import pojos.Role;
import pojos.User;

public class Test_Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
				Scanner sc = new Scanner(System.in)) {
			UserDaoImpl userDao = context.getBean("userDao", UserDaoImpl.class);
			// StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
			boolean flag = true;
			while (flag) {
				System.out.println(
						"Menu To run Application use Appropriate Option :\n1. Add User in Entity\n2. Delete User from Entity\n3. Update User Reg-amount by Id\n4. Get All Users\n"
						+ "          5. Get  Specific user by Id\n6. Get User by email");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter a following detail to add adat in entity : ");
					System.out.println("name--email--password--Role--password--Reg Amount--Reg Date");
					User user = new User(sc.next(), sc.next(), sc.next(), Role.valueOf(sc.next().toUpperCase()),
							sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()));
					int result = userDao.addUser(user);
					System.out.println("User Added Rows affected :" + result);

					break;
				case 2:
					System.out.println("Enter a ID to delete User  ? ");
					userDao.deleteUser(sc.nextInt());

					break;
				case 3:
					System.out.println("Enter a ID to Update Reg-amount  ? ");
					int rs1 = userDao.updateAmount(sc.nextInt());
					System.out.println("Rows affected : " + rs1);

					break;
				case 4:
					System.out.println("All Users from Entity Given below : ");
					List<User> user_list = userDao.getAllUser();
					for (User u : user_list) {
						System.out.println(u);
					}
					break;
				case 5:
					System.out.println("Enter Id of USer to fetch :");
					User user1 = userDao.getUserbyId(sc.nextInt());
					System.out.println(user1);
					break;
				case 6:
					System.out.println("Enter a email of User :");
					User user2=userDao.getUserByEmail(sc.next());
					System.out.println(user2);

				case 10:
					System.out.println("Successfully Terminated Application");
					flag = false;

				}
			}
		}
	}

}
