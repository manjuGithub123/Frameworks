package com.kod.student;

public class Student {

	int rollno;
	String nm;
	int Age;
	
	public Student(int rollno,String nm,int Age)
	{
		this.rollno=rollno;
		this.nm=nm;
		this.Age=Age;
	}

	public int getRollno() {
		return rollno;
	}

	public String getNm() {
		return nm;
	}

	public int getAge() {
		return Age;
	}
	

}
