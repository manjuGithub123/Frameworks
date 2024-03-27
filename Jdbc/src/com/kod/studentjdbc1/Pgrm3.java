package com.kod.studentjdbc1;
import java.sql.*;                               //inserting data
public class Pgrm3 {

	public static void main(String[] args) {
		try
		{
			String url="jdbc:mysql://localhost:3306/jdbc";
			String name="root";
			String password="M@nju123";
			String query="insert into student values(1,'manju'),(2,'sanju'),(3,'nikhil'),(4,'akhil')";
			
		//Loading the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded");
		
		//establishing a connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established "+con);
		
		//statement creating by connection
		Statement stmt=con.createStatement();
		
		//executing query by using connection
		stmt.execute(query);
		System.out.println("query is executed");
		

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}