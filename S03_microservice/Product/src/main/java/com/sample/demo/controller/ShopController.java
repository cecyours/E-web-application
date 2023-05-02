package com.sample.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
	
	@GetMapping("/list")
	public ResponseEntity<List<String>> getShopList()
	{
		
		List list = Arrays.asList("Pappu Shop","denver Cline","Mouse dU");
		
		return ResponseEntity.ok(list);
	}
}
