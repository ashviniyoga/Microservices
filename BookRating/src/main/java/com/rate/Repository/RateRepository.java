package com.rate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rate.model.Rate;

@Repository
public interface RateRepository extends JpaRepository<Rate, String>{
	Rate findByName(String name);
	
	List<Rate> findByStars(int stars);

}
