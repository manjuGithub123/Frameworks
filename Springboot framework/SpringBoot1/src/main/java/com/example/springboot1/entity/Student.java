package com.example.springboot1.entity;

public class Student {
	
	
	String kodid;
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String kodid, String name, int age) {
		super();
		this.kodid = kodid;
		this.name = name;
		this.age = age;
	}
	public String getKodid() {
		return kodid;
	}
	public void setKodid(String kodid) {
		this.kodid = kodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [kodid=" + kodid + ", name=" + name + ", age=" + age + "]";
	}
	

}
