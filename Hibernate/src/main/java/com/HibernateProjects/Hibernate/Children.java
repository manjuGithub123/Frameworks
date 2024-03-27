package com.HibernateProjects.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Children {
	@Id
	int rollno;
	String nm;
	int age;
	public Children() {
		
	}
	public Children(int rollno, String nm, int age) {
		this.rollno = rollno;
		this.nm = nm;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
		
	}
	


