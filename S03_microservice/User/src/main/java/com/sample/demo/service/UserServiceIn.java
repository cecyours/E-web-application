package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import com.sample.demo.model.User;

public interface UserServiceIn {

	User addUser(User u);
	
	Optional<User> getUser(String userId);
	
	List<User> getUsers();
}
