package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping("/getdata")
    public String getData()
    {
    	if(1==1)
    	{
    		return null;
    	}
        return "hello world";
    }
    
    @GetMapping("/getdata3")
    public String gtdata()
    {
    	return "hello world from string Objet";
    }
    
    
    @GetMapping("getdata4")
    public ResponseEntity<String> getData2()
    {
//        if(1==1)
//        {
//        	 return ResponseEntity.noContent().build();
//        }
       return  ResponseEntity.ok("Hello World");
    }
    
    
    
}


