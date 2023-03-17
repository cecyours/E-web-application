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

import com.sample.demo.model.User;
import com.sample.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class HomeController {

	@Autowired
	UserService service;
	
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
	public ResponseEntity<Optional<User>> getUser(@PathVariable("userId") String userId)
	{
		return ResponseEntity.ok(service.getUser(userId));
	}
}
