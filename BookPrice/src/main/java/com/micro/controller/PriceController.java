package com.micro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.Repository.PriceRepository;
import com.micro.model.Price;

@RestController
@RequestMapping(value="/priceapi")
public class PriceController {
	@Autowired
	private PriceRepository priceRepo;
	
	@Autowired
	RestTemplate rest;
	
	@RequestMapping(value="/price")
	public String pricestart() {
		System.out.println("Inside the price controller of BookPrice application");
		
		String rate = rest.getForObject("http://BookRatingInfo:8088/ratingapi/rating", String.class);
		//return "Price Controller" + a ;
		String bookid = rest.getForObject("http://BookDetailInfo/bookapi/getId/5", String.class);
		return "Price Controller of BookPrice Application" + rate + " " + bookid;
	}
	
	@RequestMapping("/getId/{id}")
	public  Optional<Price> PriceDetail(@PathVariable("id") int id) {
		return 	priceRepo.findById(id);
	}
	
}
