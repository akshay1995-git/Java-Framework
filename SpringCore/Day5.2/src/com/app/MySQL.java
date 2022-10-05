package com.app;

import java.sql.*;//1.import package
/*
 * Regular java application want to connect database need external jar file need to attach in buid path-configure buid path-libraries
 * jar file contain driver of database which required to connect 
 * 
 * Old Driver ==>com.mysql.jdbc.Driver
 * New Driver ==>com.mysql.cj.jdbc.Driver
 */
public class MySQL {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//2.load Driver in JDBC
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acts", "root", "sairam");//3.Create connection
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();//4.create statement
			//Data from table before insertion
			ResultSet rs = stmt.executeQuery("select * from users");//5.Execute statement
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));//process on result
			int result=stmt.executeUpdate("delete from users where id=8");//deleet query execute
			//Data from table after delete
			System.out.println("Data deleted "+result);
			ResultSet rs1 = stmt.executeQuery("select * from users");//5.Execute statement

			while (rs1.next())
				System.out.println(rs1.getInt(1) + "  " + rs1.getString(2) + "  " + rs1.getString(3));//process on result
			
			con.close();//6.close the connection
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
