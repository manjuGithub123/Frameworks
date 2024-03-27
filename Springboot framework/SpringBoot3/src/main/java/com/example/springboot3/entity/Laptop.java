package com.example.springboot3.entity;

public class Laptop {
	
	String name;
	String brand;
	int cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String name, String brand, int cost) {
		super();
		this.name = name;
		this.brand = brand;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Lap [name=" + name + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
