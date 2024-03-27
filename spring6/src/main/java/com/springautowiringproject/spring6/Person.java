package com.springautowiringproject.spring6;

public class Person {

	Mobile mob;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Mobile mob) {
		super();
		System.out.println("constructor got executed");
		
		this.mob = mob;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		System.out.println("setter got executed");
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [mob=" + mob + "]";
	}
  
}
