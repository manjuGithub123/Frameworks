package com.spring.project.springproject;

public class Student {

	int rollno;
	String name;
	int yop;
	public Student() {
		super();
		
	}
	public Student(int rollno, String name, int yop) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.yop = yop;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", yop=" + yop + "]";
	}
	 
	
}
