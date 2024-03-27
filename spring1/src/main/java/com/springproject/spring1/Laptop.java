package com.springproject.spring1;

public class Laptop {
int num;
String brand;
float price;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(int num, String brand, float price)
{
	super();
	this.num = num;
	this.brand = brand;
	this.price = price;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "laptop [num=" + num + ", brand=" + brand + ", price=" + price + "]";
}


}