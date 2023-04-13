package com.cart.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.demo.model.Cart;
import com.cart.demo.repository.CartRepo;

@Service
public class CartService implements CartServiceIn {

	
	@Autowired
	CartRepo cartRepo;
	@Override
	public Cart createCart(Cart c) {
		return cartRepo.save(c);
	}

	@Override
	public Optional<Cart> getCart(String cId) {
		// TODO Auto-generated method stub
		return cartRepo.findById(cId);
	}

	@Override
	public List<Cart> getCarts() {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

	@Override
	public List<Cart> getCartByUser(String userId) {
		// TODO Auto-generated method stub
		return cartRepo.findByUserId(userId);
	}

}
