package com.onetomany;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class OneToManyClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Dept java = new Dept(90,"java", 4);
		Dept python = new Dept(91,"python", 3);
		Dept bigDatab = new Dept(92,"Big Data", 4);
		
		List<Dept> courses = new ArrayList<Dept>();
		courses.add(java);
		courses.add(python);
		courses.add(bigDatab);
		//courses.add(new Course(94,"SQL",1));
		
		em.persist(java);
		em.persist(python);
		em.persist(bigDatab);
		
		
		Faculty sachin = new Faculty();
		sachin.setId(1);
		sachin.setName("Sachin");
		sachin.setCourse(courses);
		
		em.persist(sachin);
		
		System.out.println("Inserted");
		
		
	}

}
