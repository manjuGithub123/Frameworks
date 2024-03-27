package com.kod.jdbc3;
                                         //inserting the data in table by using addbatch method
import java.sql.*;
import java.util.Scanner;

public class Pgrm2 {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		Connection con=null;
		String query=null;
		PreparedStatement pstmt=null;
		Scanner scan=null;
		int id=0;
		String nm=null;
		int sal=0;
		try
		{
			//establish the connection
			con=DriverManager.getConnection(url,name,password);
			System.out.println("connection is established");
			query="insert into employee values(?,?,?)";

			//prepare the statement
			pstmt=con.prepareStatement(query);

			scan=new Scanner(System.in);
			System.out.println("enter the number of rows");
			int rows=scan.nextInt();
			for(int i=1;i<=rows;i++)
			{
				System.out.println("enter id,name,salary");
				id=scan.nextInt();
				nm=scan.next();
				sal=scan.nextInt();

				//complete the query
				pstmt.setInt(1, id);
				pstmt.setNString(2, nm);
				pstmt.setInt(3,sal);
			}
				//adding the batch
				pstmt.addBatch();
		
			pstmt.executeBatch();
			System.out.println("data is inserted");
	}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					scan.close();
					con.close();
					pstmt.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}

		}

	}


