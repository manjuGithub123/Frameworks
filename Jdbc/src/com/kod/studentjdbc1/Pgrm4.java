package com.kod.studentjdbc1;

import java.sql.*;
public class Pgrm4 {                     //updating values

	public static void main(String[] args) {
		try
		{
         String url="jdbc:mysql://localhost:3306/jdbc";
         String name="root";
         String password="M@nju123";
         String query="update student set nm='vinay'where nm='manju'";
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded");
		
		//establishing a connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connecction is established "+con);
		
		//creatig statement using connection
		Statement stmt=con.createStatement();
		
		//executing query by using connection
		stmt.execute(query);
		System.out.println("query is executed");
		
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}}
