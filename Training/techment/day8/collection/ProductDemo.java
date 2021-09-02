package com.techment.day8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	int id;
	String name;
	int price;
	int quantity;
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
class QuantitySorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.quantity> o2.quantity)
			return 1;
		else if(o1.quantity==o2.quantity)
			return 0;
		else
		return 0;
	}
	
}



class PriceSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		
		if(o1.price>o2.price)
			return 1;
			
			else if(o1.price<o2.price)
				return -1;
			else
				return 1;
	}
	
}


public class ProductDemo {

	public static void main(String[] args) {
		
		ArrayList<Product> prod = new ArrayList<Product>();
		prod.add(new Product(101,"Mobile",20000,10));
		prod.add(new Product(102,"Laptop",80000,20));
		prod.add(new Product(103,"Charger",500,50));
		prod.add(new Product(104,"Headphone",1500,30));
		
		System.out.println("===========Show Product==========");
		for(Product pro : prod) {
			System.out.println(pro.id + " "+ pro.name +" "+pro.price+" "+pro.quantity);
		}
		
		System.out.println("===========Sorting by name==========");
		
		Collections.sort(prod,new PriceSorting());
		{
			System.out.println(prod);
		}
		
		System.out.println("=============After Sorting===========");
		for(Product pro : prod)
		{
			System.out.println(pro.id + " "+ pro.name +" "+pro.price+" "+pro.quantity);
		}

	}

}
