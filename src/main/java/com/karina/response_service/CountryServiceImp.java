package com.karina.response_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImp implements CountryService {
	
	@Autowired
	CountryRepository crepo;
	
	public void addcountry()
	{
		Country c=new Country();
		c.setName("INDIA");
		c.setPopulation(70000000);
		
		crepo.save(c);
	}
	
	

}
