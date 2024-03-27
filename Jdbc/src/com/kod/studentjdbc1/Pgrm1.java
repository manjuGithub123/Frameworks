package com.kod.studentjdbc1;
import java.sql.*;//importing sql pacakage
public class Pgrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	String url="jdbc:Mysql://localhost:3306/jdbc";
	String name="root";
	String password="M@nju123";
	
	//Loading the drivers
	Class.forName("com.mysql.cj.jdbc.Driver");          //Loading the drivers and
	                                                   //establishing the connection
	System.out.println("Driver is loaded");
	
	//establishing the connection
	Connection con=DriverManager.getConnection(url,name,password);
	System.out.println("connection is established "+con);
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
