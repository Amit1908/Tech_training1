package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClientDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Address address = new Address();
		address.setDoorNo(100);
		address.setStreetName("BTM");
		address.setCity("Bangalore");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Amit");
		employee.setDesignation("CEO");
		employee.setAddress(address);
		
		
		em.persist(address);
		em.persist(employee);
		
		System.out.println("inserted");
		
	}

}
