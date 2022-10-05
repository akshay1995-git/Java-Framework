package com.app;

/*
 * Maven based java application required some dependencies to add in  POM.XML file to established connection between 
 * java app and database
 * 
 * 
 */

import java.sql.*;//1.import package

public class MySQL {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 2.load Driver in JDBC
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acts", "root", "sairam");// 3.Create
																												// connection
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();// 4.create statement
			ResultSet rs = stmt.executeQuery("select * from users");// 5.Execute statement
			// fetch data before inserting
			System.out.println("---------Before inserting------------------");
			System.out.println("id | age | f_name | last_name | password ");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "       " + rs.getString(2) + "       " + rs.getString(3) + "        "
						+ rs.getString(4) + "            " + rs.getString(5));// process on result
			}
			// insert data in table
			int check = stmt.executeUpdate("insert into users values (10,23,'Mayuri','Samual','psas',5400,'mayuri1',NULL)");
			System.out.println(check + "Data added");
			System.out.println("---------After inserting------------------");

			ResultSet rs1 = stmt.executeQuery("select * from users");// 5.Execute statement
			// fetch data before inserting
			System.out.println("id | age | f_name | last_name | password ");
			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + "       " + rs1.getString(2) + "       " + rs1.getString(3) + "        "
						+ rs1.getString(4) + "            " + rs1.getString(5));// process on result
			}

			//con.close();// 6.close the connection
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
