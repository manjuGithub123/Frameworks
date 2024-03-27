package com.example.springboot3.ctrlr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot3.entity.Laptop;

@RestController
@RequestMapping("/laptop")
public class Ctrlr {
Laptop lp;
@PostMapping
	public String createLaptop(@RequestBody Laptop lp)
	{
		this.lp=lp;
		return "Lap is created";
	}
	

	@GetMapping(value="{name}")
	public Laptop getinfo(@PathVariable String name)
	{
	
	return lp;
	}
	@PutMapping
	public String updateLaptop(@RequestBody Laptop lp)
	{
		this.lp=lp;
		return "Lap is updated";
	}
	@DeleteMapping(value="{name}")
	public String deletelaptop(@PathVariable String name)
	{
	lp=null;
	return "lap is deleted";
	}
		

	}