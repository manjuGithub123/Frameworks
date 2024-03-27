package com.example.springboot4.services;

import java.util.List;

import com.example.springboot4.entity.Bike;

public interface Bikeservice {

String addBike(Bike b);

Bike getBike(String engineno);

List<Bike> getAllBike();

String updateBike(Bike b);

String deleteBike(String engineno);


	
}
