package com.kod.jdbc3;

import java.sql.*;
import java.util.Scanner;
                     //updating the transaction of balance in bank b updating query
public class Pgrm3 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		Connection con=null;
		
		String query1=null;
		String query2=null;
		Scanner sc=null;

PreparedStatement pstmt1=null;
PreparedStatement pstmt2=null;

		
				try
		{
			//establish the connection
			con=DriverManager.getConnection(url,name,password);
			System.out.println("connoction is established "+con);
			
			//set autocommit as false
			con.setAutoCommit(false);
			
			//creating the query  to reduce amt from Accno1
			query1="update bank set bal=bal-? where Accno=1";
			
			//creating the query to add money to Accno3
			query2="update bank set bal=bal+? where Accno=2";
			sc=new Scanner(System.in);
			System.out.println("enter the amt to be given");
			int amt=sc.nextInt();
			
			//prepare the statement
			pstmt1=con.prepareStatement(query1);
			pstmt1.setInt(1,amt);
			
			
			pstmt2=con.prepareStatement(query2);
			pstmt2.setInt(1,amt);
			
			//execute the query
			pstmt1.executeUpdate();
			System.out.println("amt is debited from Accno1");
			pstmt2.executeUpdate();
			System.out.println("amt is credited to Accno3");
			
			//commiting the changey
			con.commit();
			
			}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		finally
		{
			try
			{
				con.close();
				pstmt1.close();
				pstmt2.close();
				sc.close();
			}
			catch(Exception e)
			{
				try {
					con.rollback();
					System.out.println("changes are rollbacked");
				}
				catch (SQLException e1) {
					
					e1.printStackTrace();
				}

			}
		}

	}

}
