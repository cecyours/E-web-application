package com.sample.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.demo.model.User;

public interface UserRepo extends MongoRepository<User, String>{

	// custom
}
