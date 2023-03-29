package com.cart.demo.service;

import java.util.List;
import java.util.Optional;

import com.cart.demo.model.Cart;

public interface CartServiceIn {

	public Cart createCart(Cart c);
	
	public Optional<Cart> getCart(String cId);
	
	public List<Cart> getCarts();
	
//	custom
	public List<Cart> getCartByUser(String userId);
}
