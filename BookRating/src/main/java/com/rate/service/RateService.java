package com.rate.service;

import java.util.List;

import com.rate.model.Rate;

public interface RateService {
	
	public void saveRating(Rate r);
	
	public void deleteRating(Rate r);
	
	public List<Rate> getAllRates();
	
	public List<Rate> getByStar(int star);

}
