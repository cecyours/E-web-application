package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Book;

public interface BookServiceInterface {

	public Book addBook(Book b);
	
	public Optional<Book> getBook(String bId);
	
	public List<Book> getBooks();
}
