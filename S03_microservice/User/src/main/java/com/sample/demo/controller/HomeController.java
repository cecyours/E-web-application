package com.sample.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.demo.model.Cart;
import com.sample.demo.model.Product;
import com.sample.demo.model.User;
import com.sample.demo.request.CartService;
import com.sample.demo.request.ProductService;
import com.sample.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class HomeController {

	List<Cart> cList;
	Cart c;
	@Autowired
	UserService service;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ProductService productService;
	@Autowired
	CartService cartService;
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User u)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addUser(u));
	}
	
	@GetMapping("/im")
	public ResponseEntity<List<User>> getUsers()
	{
		return ResponseEntity.ok(service.getUsers());
	}
	
	@GetMapping("/im/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId") String userId)
	{
		User  user = service.getUser(userId).get();
		
//		 cList = restTemplate.getForObject("http://CART-SERVICE:8096/cart/user/"+user.getUserId(), ArrayList.class);
		
		cList = cartService.getCartList(user.getUserId());
//		ArrayList<Cart> new_list = new ArrayList();
		
		System.out.print(cList.size());
		System.out.println(" hello me...");
//		
		System.out.print("Heiilo");
		 
		ObjectMapper mapper = new ObjectMapper();
		
		List<Cart> myCartList = mapper.convertValue(
			    cList, 
			    new TypeReference<List<Cart>>(){}
			);
		
		for(int i=0;i<myCartList.size();i++)
		{
			Product p = productService.getProduct(myCartList.get(i).getProductId());
			Cart c = myCartList.get(i);
			c.setProduct(p);
			myCartList.set(i,c);
		}
//		System.out.print(accountList.get(0).getCartId());
//		String pId = myCartList.get(0).getProductId();
//	
//		System.out.print("help : "+productService.getProduct(pId));
//		Cart c = myCartList.get(0);
//		
//		c.setProduct(productService.getProduct(c.getProductId()));
//		myCartList.set(0, c);
		
		user.setCartList(myCartList);
		
		return ResponseEntity.ok(user);
	}
}
