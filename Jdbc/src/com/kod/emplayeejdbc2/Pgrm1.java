package com.kod.emplayeejdbc2;   //project of insert,update,delete,select data in table

import java.sql.*;
import java.util.Scanner;

public class Pgrm1 {

	public static void insert(Statement stmt)throws Exception
	{
		String query="insert into employee values(1,'manju',66666),(2,'sanju',77777),(3,'manu',88888)";
		stmt.executeUpdate(query);
		System.out.println("data is inserted");
	}
	
	public static void update(Statement stmt)throws Exception
	{
		String query="update employee set name='nikhil' where id=3";
		stmt.executeUpdate(query);
		System.out.println("data is updated");
		
	}
	
	public static void delete(Statement stmt) throws Exception
	{
		String query="delete from employee where id=1";
		stmt.executeUpdate(query);
		System.out.println("data is deleted");
	}
	
	public static void select(Statement stmt)throws Exception
	{
		String query="select * from employee";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println((rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)));
		}
		
	}
	
public static void main(String[] args)throws Exception {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		
		
		//establish the connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established "+con);
		
		//create statement by using connection
		Statement stmt=con.createStatement();
		
		
	//scanner cls for id,name,password
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("enter 1 for insert,enter 2 for update,enter 3 for delete,enter 4 for select");
			int choice=sc.nextInt();
			
			if(choice==1)
			{
				insert(stmt);
			}
			else if(choice==2)
			{
				update(stmt);
			}
			else if(choice==3)
			{
			delete(stmt);
			}
			else if(choice==4)
			{
				select(stmt);
				
			}
			else
			{
				System.out.println("incorrect choice");
				System.exit(0);
			}
			
		}
		
	}

	
	
	
}


