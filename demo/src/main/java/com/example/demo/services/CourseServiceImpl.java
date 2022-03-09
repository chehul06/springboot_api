package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.DashDao;
import com.example.demo.entites.orders;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private DashDao dashDao;

	
	List<orders> list;
	
	public CourseServiceImpl() {
		
		
	}
	
    public List<orders> getProducts() {
		// TODO Auto-generated method stub
		return dashDao.findAll();
	}

	@Override
	public orders addproduct(orders order) {
		dashDao.save(order);
		return order;
	}

	
	

	@Override
	public orders updateeorder(orders order) {
		dashDao.save(order);
		return order;
		
	}
    
    

}
