package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import com.sample.demo.model.Product;

public interface ProductServiceIn {

	Product addProduct(Product p);
	
	Optional<Product> getProduct(String productId);
	
	List<Product> getProducts();
	
}
