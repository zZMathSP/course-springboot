package com.zzmath.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzmath.course.entities.Order;
import com.zzmath.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository reposirory;
	
	public List<Order> findAll() {
		return reposirory.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = reposirory.findById(id);
		return obj.get();
	}
}
