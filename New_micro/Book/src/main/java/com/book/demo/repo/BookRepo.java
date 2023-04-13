package com.book.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.book.demo.model.Book;


public interface BookRepo extends MongoRepository<Book, String> {

}
