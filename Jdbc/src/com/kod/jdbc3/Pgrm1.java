package com.kod.jdbc3;

import java.sql.*;      //inserting multiple rows in table
import java.util.*;

public class Pgrm1 {

	public static void main(String[] args)throws Exception {
		
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		
		System.out.println("enter the rows to be  inserted");
		int row=sc.nextInt();
		

		//establish the connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established");
		
		
		for(int i=1;i<=row;i++)
		{
			String query="insert into employee values(?,?,?)";
			System.out.println("enter id , name , and salary");
			int id=sc.nextInt();
			String nm=sc.next();
			int sal=sc.nextInt();
			
			//prepare the statement
			PreparedStatement pstmt=con.prepareStatement(query);
			
			//complete the prepared statement
			pstmt.setInt(1, id);
			pstmt.setString(2,nm);
		 pstmt.setInt(3,sal);
			
			//execute the preapre statement
			pstmt.executeUpdate();
			System.out.println("data is inserted");
			
					
			
			
			
		}
		
		
		

	}

}
