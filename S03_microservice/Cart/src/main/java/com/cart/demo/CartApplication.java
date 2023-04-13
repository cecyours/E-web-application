package com.cart.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import jakarta.annotation.PostConstruct;

import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication

public class CartApplication {

	  @PostConstruct
	  public void init(){
	    // Setting Spring Boot SetTimeZone
	    TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	  }
	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}

}
