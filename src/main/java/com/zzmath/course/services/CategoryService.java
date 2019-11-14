package com.zzmath.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzmath.course.entities.Category;
import com.zzmath.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository reposirory;
	
	public List<Category> findAll() {
		return reposirory.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = reposirory.findById(id);
		return obj.get();
	}
}
