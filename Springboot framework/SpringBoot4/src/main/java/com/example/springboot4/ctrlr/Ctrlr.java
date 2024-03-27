package com.example.springboot4.ctrlr;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot4.entity.Bike;
import com.example.springboot4.services.Bikeservice;

@RestController
@RequestMapping("/bike")
public class Ctrlr<bike> {
	Bikeservice bs;

	public Ctrlr(Bikeservice bs) {
		super();
		this.bs = bs;
	}
	
	
	
	//creating and storing bike object
	@PostMapping
	public String addBike(@RequestBody Bike b)
	{
		String msg=bs.addBike(b);
		return msg;
	}
	//fetching a specific bike object
	@GetMapping(value="{engineno}")
	public Bike getBike(@PathVariable String engineno)
	{
	Bike b=bs.getBike(engineno);
	return b;
	}
	//fetching all bike object
	@GetMapping
	public List<Bike> getAllBike()
	{
		List<Bike> blist=bs.getAllBike();	
	      return blist;
	}
	//updating bike object
	@PutMapping
	public String updateBike(@RequestBody Bike b)
	{
		String msg=bs.updateBike(b);
		return msg;
	}
	//delleting bike object
@DeleteMapping(value="{engineno}")
public String deleteBike(@PathVariable String engineno)
{
	String msg=bs.deleteBike(engineno);
	return msg;
}
}
