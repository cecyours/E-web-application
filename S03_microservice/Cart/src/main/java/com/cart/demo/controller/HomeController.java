package com.cart.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.demo.model.Cart;
import com.cart.demo.service.CartService;

@RestController
@RequestMapping("/cart")
public class HomeController {

	@Autowired
	CartService cartService;

	@PostMapping("/add")
	public ResponseEntity<Cart> createCart(@RequestBody Cart c)
	{
		c = cartService.createCart(c);
		System.out.print(c+" - dvd");
		return ResponseEntity.status(HttpStatus.CREATED).body(c);
	}
	

	@GetMapping("/carts")
	public ResponseEntity<List<Cart>> getCarts()
	{

		System.out.println("hello me");
		return ResponseEntity.ok(cartService.getCarts());
				
	}
	
	@GetMapping("/cart/{cId}")
	public ResponseEntity<Optional<Cart>> getCart(@PathVariable("cId") String cId)
	{
		return ResponseEntity.ok(cartService.getCart(cId));
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Cart>> getCartByUser(@PathVariable("userId") String userId)
	{
		return ResponseEntity.ok(cartService.getCartByUser(userId));
	}
}

