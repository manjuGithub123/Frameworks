package com.kod.emplayeejdbc2;
                                         //insert,update,delete and select by using user input
import java.sql.*;
import java.util.Scanner;

public class Pgrm3 {

	//method to insert data in db
	public static void insert(Connection con)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String query="insert into employee values(?,?,?)";
		System.out.println("enter the id,name and salary");
		int id=sc.nextInt();
		String nm=sc.next();
		int sal=sc.nextInt();

		//prepare the statement
		PreparedStatement pstmt=con.prepareStatement(query);

		//completing the query to be executed
		pstmt.setInt(1,id);
		pstmt.setString(2, nm);
		pstmt.setInt(3, sal);

		////execute the query
		pstmt.executeUpdate();
		System.out.println("data is inserted");	
	}

	public static void update(Connection con)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String query="update employee set salary=? where id=?";
		System.out.println("enter the salary and id to update the data");
		String name=sc.next();
		int sal=sc.nextInt();

		//perpare the statement
		PreparedStatement pstmt=con.prepareStatement(query);

		//completing the statement
		pstmt.setString(1, name);
		pstmt.setInt(2, sal);

		//execute the statement
		pstmt.execute();
		System.out.println("data is updated");		
	}

	public static void delete(Connection con)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String query="delete from employee where id=?";
		System.out.println("enter the id to be deleted");
		int id=sc.nextInt();

		//prepare the statement
		PreparedStatement pstmt=con.prepareStatement(query);

		//completing thestatement
		pstmt.setInt(1, id);

		//execute the statement
		pstmt.executeUpdate();
		System.out.println("data is deleted");

	}
	public static void select(Connection con)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String query="select * from employee wher id=?";
		System.out.println("enter the id to be selected");
		int id=sc.nextInt();

		//prepare the statement
		PreparedStatement pstmt=con.prepareStatement(query);

		//complete the statement
		pstmt.setInt(1, id);

		//execute the query 
		ResultSet rs=pstmt.executeQuery(query);
		while(rs.next())
		{

			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

		}

	}
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		
		//establish the  connection
		Connection con=DriverManager.getConnection(url,name,password);
		System.out.println("connection is established "+con);
		while(true)
		{
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 : insert(con);
			case 2 : update(con);
			case 3 : delete(con);
			case 4 : select(con);
			default : System.out.println("incorrect choice");
			
			System.exit(0);
			}
		}
			
		
		
	}
}