package com.cart.demo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cart.demo.model.Cart;

public interface CartRepo extends MongoRepository<Cart, String>{

//	custom queries
	
	List<Cart> findByUserId(String userId);
	
}
