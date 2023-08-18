package com.example.day1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
	@GetMapping("/welcome")
	
	public String welcome()
	{
		return "Welcome";
	}

}
