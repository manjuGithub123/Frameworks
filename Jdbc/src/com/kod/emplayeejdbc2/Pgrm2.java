package com.kod.emplayeejdbc2;

import java.sql.*;                //insertation of data by taking userinput
import java.util.Scanner;

public class Pgrm2 {

	public static void main(String[] args) throws Exception {
		
		//values for url,nm,pwd for establishing the connection
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		
		//taking use input for id,name,salary to be insert in table
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String nm=sc.next();
		System.out.println("enter the salary");
		int sal=sc.nextInt();
		
		//creating a query to be executed for dynamic data
		String query="insert into employee values(?,?,?)";   //query with placeholder
		
		//establishing the connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established");
		
		//preapring the statement
		PreparedStatement pstmt=con.prepareStatement(query);
		
		//completing the query to be executed
		pstmt.setInt(1, id);
		pstmt.setString(2, nm);    //placeholder index,value
		pstmt.setInt(3, sal);
		
		//executing the query
		pstmt.executeUpdate();
		System.out.println("row is inserted");
		
		
	}
}
