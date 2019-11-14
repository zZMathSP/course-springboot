package com.zzmath.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzmath.course.entities.Product;
import com.zzmath.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository reposirory;
	
	public List<Product> findAll() {
		return reposirory.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = reposirory.findById(id);
		return obj.get();
	}
}
