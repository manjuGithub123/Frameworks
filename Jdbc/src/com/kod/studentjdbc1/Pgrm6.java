package com.kod.studentjdbc1;

import java.sql.*;

public class Pgrm6 {

	public static void main(String[] args)throws Exception {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
				String password="M@nju123";
	   String query="select * from student";                 //Traversing all data in database
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded");
		
		//establishing the connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established "+con);
		
		//creating statement by using connection and get result set
		Statement stmt=con.createStatement();
		
		//executing query by using result set 
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("query is executed");
		
		//retriving using resultset
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));	//displaying data onf table
		}
	}
	

}
