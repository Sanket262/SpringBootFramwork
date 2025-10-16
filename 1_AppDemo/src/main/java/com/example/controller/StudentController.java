package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/print")
	public String getData(@RequestParam String name)
	{
		return "hello "+ name;
	}
	
	
	
	
	@GetMapping("/print2")
	public String userData(@RequestParam(required=false) String name1 )
	{
		return "hello" + (name1!=null? name1:"sanket");
	}

}
