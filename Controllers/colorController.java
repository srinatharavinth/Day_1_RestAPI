package com.example.day1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorController{
	
	String color = "Blue";
	@GetMapping("//")
	
	public String welcome()
	{
		return "My favourite color is "+color+" !";
	}

}
