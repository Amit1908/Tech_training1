package com.techment.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//Project Name JPADemo
public class Client {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = new Product();
		Product product2 = new Product();
		product.setId(3);
		product.setName("Laptop");
		product.setPrice(45000);
		product.setCategory("Electronics");
		
		em.persist(product);
		
		
		
		product2.setId(4);
		product2.setName("Mobile");
		product2.setPrice(15000);
		product2.setCategory("Electronics");
		
		em.persist(product2);
		
		
		
		
		em.getTransaction().commit();
		

	}

}
