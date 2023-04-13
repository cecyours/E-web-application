package com.book.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.book.demo.repo.BookRepo;

@Rest
@RequestMapping
public class HomeController {

	@Autowired
	BookRepo bookRepo;
	
}
