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
		String a = rest.getForObject("http://BookDetailInfo/bookapi/book", String.class);
		
		System.out.println("Inside the price controller");
		return "Price Controller" + a ;
	}
	
	@RequestMapping("/getId/{id}")
	public  Optional<Price> PriceDetail(@PathVariable("id") int id) {
		return 	priceRepo.findById(id);
	}
	
}
