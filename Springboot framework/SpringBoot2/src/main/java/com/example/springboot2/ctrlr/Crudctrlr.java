package com.example.springboot2.ctrlr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot2.entity.Emp;

@RestController
@RequestMapping("/crud")
public class Crudctrlr {
	
	@GetMapping(value="{man101}")
	public Emp getinfo(@PathVariable String man101)
	{
		Emp e1=new Emp(man101,"sanju",45000);
		return e1;
	}

}
