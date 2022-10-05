package com.app;

import java.io.FileInputStream;
import java.sql.*;//1.import package
/*
 * Regular java application want to connect database need external jar file need to attach in buid path-configure buid path-libraries
 * jar file contain driver of database which required to connect 
 * 
 * Old Driver ==>com.mysql.jdbc.Driver
 * New Driver ==>com.mysql.cj.jdbc.Driver
 */
public class ImageStore {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//2.load Driver in JDBC
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "sairam");//3.Create connection
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();//4.create statement
			//-----------code to store blob file in database----------------
//			PreparedStatement ps=con.prepareStatement("insert into img_table values(?,?,?)");  
//			ps.setInt(1,101);  
//			ps.setString(2, "Akshay");  
//			FileInputStream fin=new FileInputStream("E:\\photo.jpg");  
//			ps.setBinaryStream(3,fin,fin.available());  
//			int i=ps.executeUpdate();  
//			System.out.println(i+" records affected"); 
			//-----------------Retrieve blob data stored in table ---------------
			ResultSet rs = stmt.executeQuery("select * from img_table");
			while (rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getBlob(3));
			}
			con.close();//6.close the connection
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
