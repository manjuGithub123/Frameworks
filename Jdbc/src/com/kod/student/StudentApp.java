package com.kod.student;

import java.sql.*;
import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String name="root";
		String password="M@nju123";
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		
		PreparedStatement pstm=null;
		
int rollno=0;
String nm=null;
int age=0;
PreparedStatement pstmt=null;
try
{
	con=DriverManager.getConnection(url,name,password);
	System.out.println("connection is established");
Student s1=new Student(11,"ajay",22);	
Student s2=new Student(12,"ankit",23);	
Student s3=new Student(13,"akash",24);
String query="insert into Students values(?,?,?)";

pstmt=con.prepareStatement(query);
pstmt.setInt(1, s1.getRollno());
pstmt.setString(2,s1.getNm());
pstmt.setInt(3, s1.getAge());
pstmt.execute();


pstmt.setInt(1, s2.getRollno());
pstmt.setString(2,s2.getNm());
pstmt.setInt(3, s2.getAge());
pstmt.execute();

pstmt.setInt(1, s3.getRollno());
pstmt.setString(2,s3.getNm());
pstmt.setInt(3, s3.getAge());
pstmt.execute();



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