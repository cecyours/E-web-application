package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@Service
public class BookService implements BookServiceInterface {

	@Autowired
	
	BookRepo bookRepo;
	@Override
	public Book addBook(Book b) {
		
		return bookRepo.save(b);
	}

	@Override
	public Optional<Book> getBook(String bId) {
		
		return bookRepo.findById(bId);
	}

	@Override
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}

	
}
