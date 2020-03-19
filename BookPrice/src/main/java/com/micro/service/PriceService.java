package com.micro.service;

import java.util.List;

import com.micro.model.Price;

public interface PriceService {
	public void savePrice(Price p );
	
	public void deletePrice(Price P);
	
	public List<Price> getAllPrice();
	
	

}
