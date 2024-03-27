package com.kod.studentjdbc1;

import java.sql.*;
                                           //deleting values
public class Pgrm5 {

	public static void main(String[] args) {
		try
		{
			String url="jdbc:mysql://localhost:3306/jdbc";
			String name="root";
			String password="M@nju123";
			String query="delete from student where rollno=3";
			//Loading the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");

			//establishing the connection
			Connection con=DriverManager.getConnection(url,name,password);
			System.out.println("connection is established "+con);

			//creating statement by using connection
			Statement stmt=con.createStatement();

			//execuing query by using connection
			stmt.executeUpdate(query);
			System.out.println("query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}