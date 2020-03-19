package com.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.Price;
@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
	
	Price findByTax(String Tax);

}
