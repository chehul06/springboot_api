package com.example.demo.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entites.orders;

public interface CourseService {

	public List<orders> getProducts();
	
	 public orders addproduct(orders product);
	 public orders updateeorder(orders order);
}
