package com.wipro.priceservice.dao.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.wipro.priceservice.dao.PriceDao;
import com.wipro.priceservice.entity.Price;
import com.wipro.priceservice.repository.PriceRepository;

@Component
public class PriceDaoImpl implements PriceDao {
	
	@Autowired
	PriceRepository pricerepo;
	
	@Override
	public List<Price> findAllPrice() {
		return pricerepo.findAll();
	}
	
	@Override
	public Price saveAndFlushBook(Price price) {
		
		return pricerepo.saveAndFlush(price);
	}

	@Override
	public boolean existsByProductId(int productID) {
		// TODO Auto-generated method stub
		return pricerepo.existsById(productID);
	}
	
	@Override
	public Price findByProductId(int productID) {
		// TODO Auto-generated method stub
		return pricerepo.findById(productID).get();
	}
	
	@Override
	public void deleteProductPriceByID(int productID) {
		pricerepo.deleteById(productID);
	}
	
	@Override
	public void deleteAllProductPrice() {
		pricerepo.deleteAll();
	}

	


}
