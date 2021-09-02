package com.test2.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class OneToManyClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Emp e1 = new Emp("Amit", "developer");
		Emp e2 = new Emp("Kumar", "hr");
		
		
		//to store in database
		em.persist(e1);
		em.persist(e2);
		
		
		//to store all emp in list as it becomes many
		List<Emp> employees = new ArrayList<Emp>();
		employees.add(e1);
		employees.add(e2);
		
		
		Department d1 = new Department();
		d1.setName("hr");
		d1.setEmployees(employees);
		
		
		em.persist(d1);
		
		
	}

}
