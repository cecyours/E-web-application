package com.sample.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.demo.model.Product;

public interface ProductRepo extends MongoRepository<Product, String>{

//	custom query
	
}
