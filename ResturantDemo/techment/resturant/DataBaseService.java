package com.techment.resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {
	
	@Autowired
	@Qualifier("tea")
	IHotDrink hotdrink;
	
	@Autowired
	@Qualifier("pepsi")
	ISoftDrink softdrink;
	
	public void details()
	{
		hotdrink.drink();
		softdrink.drink();
	}
	

}
