package com.zzmath.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzmath.course.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Matheus", "matheus@gmail.com", "998623207", "12345");
		return ResponseEntity.ok().body(u);
	}
}
