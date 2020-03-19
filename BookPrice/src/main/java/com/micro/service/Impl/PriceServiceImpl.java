package com.micro.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.Repository.PriceRepository;
import com.micro.model.Price;
import com.micro.service.PriceService;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	private PriceRepository priceRepo;

	@Override
	public void savePrice(Price p) {
		// TODO Auto-generated method stub
		priceRepo.save(p);

	}

	@Override
	public void deletePrice(Price p) {
		// TODO Auto-generated method stub
		System.out.println("Inside the delete Price");
		priceRepo.delete(p);

	}

	@Override
	public List<Price> getAllPrice() {
		// TODO Auto-generated method stub
		System.out.println("Inside the getAllPrice () in Price Impl pkg");
		return priceRepo.findAll();
	}

}
