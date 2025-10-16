package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
	
	@GetMapping({"/data", "/data/{id}"})
	public ResponseEntity<String> getData(@PathVariable(required=false) Integer id)
	{
		if(id==null)
		{
		    return ResponseEntity
		    		.badRequest()
		    		.body("Id Is Required");
		    		
		}
		if(id==2)
		{
			return ResponseEntity.ok("ok id is 2 present oin a database Hello World   from a Server");
		}
		return ResponseEntity.ok("Excute one code");
		
	}
	
	
	@GetMapping("/data2")
	public ResponseEntity<String> getData2(@RequestParam(required=false) String name)
	{
		if(name==null || name.isEmpty())
		{
			return ResponseEntity
					.badRequest().
					body("Name is required in the Request Paramater");
		}
		else
		{
			return ResponseEntity.ok("Name is Reuired");
		}
	}
	
	

}
