package com.zzmath.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzmath.course.entities.User;
import com.zzmath.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository reposirory;
	
	public List<User> findAll() {
		return reposirory.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = reposirory.findById(id);
		return obj.get();
	}
}
