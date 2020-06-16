package com.wipro.priceservice.dao;

import java.util.List;

import com.wipro.priceservice.entity.Price;



public interface PriceDao {

	List<Price> findAllPrice();

	Price saveAndFlushBook(Price price);

	boolean existsByProductId(int productID);

	Price findByProductId(int productID);

	void deleteProductPriceByID(int productID);

	void deleteAllProductPrice();

}
