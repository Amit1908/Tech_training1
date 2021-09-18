package com.techment.model;

import java.util.List;

public class Resturant {

	String resturantName;
	IHotDrink hotDrink;
	ISoftDrink softDrink;
	
	public void RestaurantDeatils()
	{
		System.out.println("Resturant Name : "+resturantName);
		hotDrink.drink();
		softDrink.drink();
		
	}
	public void setResturantName(String restaurantName) {
		this.resturantName = resturantName;
		
	}
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}
}
