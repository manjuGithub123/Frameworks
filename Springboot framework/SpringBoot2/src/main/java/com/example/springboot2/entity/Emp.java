package com.example.springboot2.entity;

public class Emp {
	
	String empid;
	String name;
	int salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
