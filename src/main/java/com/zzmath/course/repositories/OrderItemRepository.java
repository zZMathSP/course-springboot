package com.zzmath.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzmath.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
