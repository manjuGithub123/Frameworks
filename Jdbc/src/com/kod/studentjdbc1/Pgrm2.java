package com.kod.studentjdbc1;

import java.sql.*;  //importing sql package

public class Pgrm2 {

	public static void main(String[] args) {
		try
		{
			String url="jdbc:mysql://localhost:3306/jdbc";
			String name="root";
			String password="M@nju123";
			String query="create table student(rollno int,nm varchar(10))";
		//Loading the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");            //crating query and statement and executing
		System.out.println("Driver is loaded");
		
		//Establishing the connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established "+con);
		
		//creating statement using connection
		Statement stmt=con.createStatement();
		
		//executing query by using statement
		stmt.execute(query);
		System.out.println("query is executed");

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}