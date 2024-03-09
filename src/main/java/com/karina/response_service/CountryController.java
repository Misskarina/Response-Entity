package com.karina.response_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@Autowired
	CountryService serv;
	
	@RequestMapping("/save")
	public String save()
	{
		serv.addcountry();
		return "data saved";
	}

}
