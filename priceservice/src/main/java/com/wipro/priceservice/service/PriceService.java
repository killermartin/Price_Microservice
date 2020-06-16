package com.wipro.priceservice.service;

import java.util.List;

import com.wipro.priceservice.entity.Price;
import com.wipro.priceservice.exception.ServiceException;

public interface PriceService {

	List<Price> getAllPrice() throws ServiceException;
	
	String addPrice(Price price) throws ServiceException;

	Price getPrice(int productID) throws ServiceException;

	String updateProductPrice(Price price) throws ServiceException;

	String deleteProductPriceById(int productID) throws ServiceException;

	String deleteAllProductPrice();

	

	

	

}
