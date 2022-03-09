package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.orders;

public interface DashDao extends JpaRepository<orders,Long> {

}
