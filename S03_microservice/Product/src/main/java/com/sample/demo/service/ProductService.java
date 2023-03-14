package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.model.Product;
import com.sample.demo.repository.ProductRepo;

@Service
public class ProductService implements ProductServiceIn {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product addProduct(Product p) {
		return productRepo.save(p);
	}

	@Override
	public Optional<Product> getProduct(String productId) {
		
		return productRepo.findById(productId);
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepo.findAll();
	}

}
