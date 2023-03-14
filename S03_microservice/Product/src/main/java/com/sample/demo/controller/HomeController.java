package com.sample.demo.controller;

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

import com.sample.demo.model.Product;
import com.sample.demo.service.ProductService;

import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/product")
public class HomeController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product p)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(p));
	}
	
	@GetMapping("/mypro")
	public ResponseEntity<List<Product>> getProducts()
	{
		return ResponseEntity.ok(productService.getProducts());
	}
	
	@GetMapping("/mypro/{productId}")
	public ResponseEntity<Optional<Product>> getProduct(@PathVariable("productId") String productId)
	{
		return ResponseEntity.ok(productService.getProduct(productId));
	}
	
	
}
