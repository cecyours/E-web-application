package com.book.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.book.demo.model.Book;
import com.book.demo.repo.BookRepo;


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
