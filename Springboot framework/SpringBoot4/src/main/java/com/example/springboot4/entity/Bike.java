package com.example.springboot4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	String engineno;
	String brand;
	int cost;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String engineno, String brand, int cost) {
		super();
		this.engineno = engineno;
		this.brand = brand;
		this.cost = cost;
	}
	public String getEngineno() {
		return engineno;
	}
	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [engineno=" + engineno + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
