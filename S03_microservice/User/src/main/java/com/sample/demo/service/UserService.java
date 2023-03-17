package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.model.User;
import com.sample.demo.repository.UserRepo;

@Service
public class UserService implements UserServiceIn {


	@Autowired
	UserRepo userRepo;
	
	@Override
	public User addUser(User u) {
			return userRepo.save(u);
	}

	@Override
	public Optional<User> getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
