package com.zzmath.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzmath.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
