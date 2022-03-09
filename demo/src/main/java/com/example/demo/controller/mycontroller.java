package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.*;
import com.example.demo.services.CourseService;

@RestController
public class mycontroller {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
		
	}
	
	@GetMapping("/order")
	public List<orders> getProducts()
	{
		
		return this.courseService.getProducts();
		
	}
	
	@PutMapping("/order")
    public orders updateorder(@RequestBody orders order) {
		
		
		return this.courseService.updateeorder(order);
		
    	
    }
	
	@GetMapping("/customer")
	public List<orders> getCustomer()
	{
		
		return this.courseService.getProducts();
		
	}
	
	@PostMapping("/customer")
    public orders addcustomer(@RequestBody orders product) {
		
		
		return this.courseService.addproduct(product);
			
    }

	
	
	
	@PostMapping("/order")
    public orders addproduct(@RequestBody orders product) {
		
		
		return this.courseService.addproduct(product);
			
    }

}
