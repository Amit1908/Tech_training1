package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.model.Resturant;

public class ResturantClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Resturant resturant = (Resturant) factory.getBean("r");
//		resturant.displayResturantDeatils();
		resturant.RestaurantDeatils();

	}

}
