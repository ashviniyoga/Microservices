package com.rate.RateController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/ratingapi")
public class RateController {
	 @LoadBalanced
	  @Bean
	  RestTemplate restTemplate(){
	    return new RestTemplate();
	  }
	
	 @Autowired
	  RestTemplate rest;
		 
	@RequestMapping("/rating")
	public String rating() {
		System.out.println("Inside the controller rating()");
		String r = rest.getForObject("http://BookDetailInfo:8086/bookapi/getId/2",String.class);
		return r + "Rating Control in Book Rate Application";
		
	}

}
