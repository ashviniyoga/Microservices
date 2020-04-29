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
		System.out.println("Before calling the book price");
	String price = rest.getForObject("http://BookPriceInfo/priceapi/price", String.class);
	String rate = rest.getForObject("http://BookRatingInfo:8088/ratingapi/rating", String.class);
	
		
		System.out.println("Inside the book controller - book details application");
		return price + "== Combination of Book Price and Book details APplication :))" +rate;
	//	return "book details";
	}
	
	@RequestMapping("/getId/{id}")
	public  Optional<Book> BookDetail(@PathVariable("id") int id) {
		System.out.println("Inside the book detail getID");
		return 	bookRepo.findById(id);
	}
	
}
