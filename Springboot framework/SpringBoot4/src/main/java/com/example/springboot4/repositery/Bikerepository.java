package com.example.springboot4.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot4.entity.Bike;

public interface Bikerepository extends JpaRepository<Bike, String>
{
	

}
