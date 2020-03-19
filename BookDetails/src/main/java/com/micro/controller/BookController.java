package com.micro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.Repository.BookRepository;
import com.micro.model.Book;

@RestController
@RequestMapping(value="/bookapi")
public class BookController {
	@Autowired
	private BookRepository bookRepo;
	
	 @Autowired
	 RestTemplate rest;
	
	@RequestMapping(value="/book")
	public String bookstart() {
	String b = rest.getForObject("http://BookPriceInfo/priceapi", String.class);
	//String r = rest.getForObject("http://BookRatingInfo:8088/ratingapi/rating", String.class);
	
		
		System.out.println("Inside the book controller");
		return b + " Book details";
	}
	
	@RequestMapping("/getId/{id}")
	public  Optional<Book> BookDetail(@PathVariable("id") int id) {
		return 	bookRepo.findById(id);
	}
	
}
