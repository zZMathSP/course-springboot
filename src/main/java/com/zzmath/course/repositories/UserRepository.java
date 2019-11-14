package com.zzmath.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzmath.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
