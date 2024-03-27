package com.springautowiringproject.spring6;

public class Mobile {
String brand;
int ram;
float cost;
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobile(String brand, int ram, float cost) {
	super();
	this.brand = brand;
	this.ram = ram;
	this.cost = cost;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "mobile1 [brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
}

}
