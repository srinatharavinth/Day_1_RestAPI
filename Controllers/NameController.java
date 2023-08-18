package com.example.day1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController{
	
	String name = "Srikanth";
	@GetMapping("/")
	
	public String welcome()
	{
		return "welcome "+name+" !";
	}

}
