package com.rate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rate.Repository.RateRepository;
import com.rate.model.Rate;

@Service
public class RateServiceImpl implements RateService {

	@Autowired
	private RateRepository rateRepo;
	

	@Override
	public void saveRating(Rate r) {
		// TODO Auto-generated method stub
		System.out.println("This will save the entity r in the DB. This is called in saveRating() in RateserviceImpl");
		rateRepo.save(r);

	}

	@Override
	public void deleteRating(Rate r) {
		// TODO Auto-generated method stub
		System.out.println("Inside the delete Rating service Impl to delete the name");
		rateRepo.delete(r);

	}

	@Override
	public List<Rate> getAllRates() {
		// TODO Auto-generated method stub
		System.out.println("This will list all the ratings");
		return rateRepo.findAll();
	}

	@Override
	public List<Rate> getByStar(int star) {
		// TODO Auto-generated method stub
		System.out.println("This will list all the rating depending on the star mentioned. called by getStar() in rateservice impl");
		return rateRepo.findByStars(star);
	}

}
