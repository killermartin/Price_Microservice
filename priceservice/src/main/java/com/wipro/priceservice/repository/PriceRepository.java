package com.wipro.priceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.priceservice.entity.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {

}
