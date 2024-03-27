package com.example.springboot4.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springboot4.entity.Bike;
import com.example.springboot4.repositery.Bikerepository;
@Service
public class Bikeserviceimplementation implements Bikeservice{

	Bikerepository  br;

	

	public Bikeserviceimplementation(Bikerepository br) {
		super();
		this.br = br;
	}

	@Override
	public String addBike(Bike b) {
		br.save(b);
		return "bike is added";
	}

	@Override
	public Bike getBike(String engineno) {
		// TODO Auto-generated method stub
		Bike b=br.findById(engineno).get();
		return b;
	}
@Override
	public List<Bike> getAllBike() 
	{
		// TODO Auto-generated method stub
		List<Bike> blist=br.findAll();

		return blist;
	}

	@Override
	public String updateBike(@RequestBody Bike b) {
		// TODO Auto-generated method stub
		br.save(b);
		return "bike is updated";
	}

	@Override
	public String deleteBike(String engineno) {
		// TODO Auto-generated method stub
		br.deleteById(engineno);
		return "bike is deleted";
	}
	
}
