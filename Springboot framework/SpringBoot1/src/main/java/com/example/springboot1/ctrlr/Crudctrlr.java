package com.example.springboot1.ctrlr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot1.entity.Student;
@RestController
@RequestMapping("/crud")
public class Crudctrlr {
	@GetMapping(value="{kodid}")
	public Student getinfo(@PathVariable String kodid)
	{
		Student s1=new Student(kodid,"manju",23);
				return s1;
	}
}
