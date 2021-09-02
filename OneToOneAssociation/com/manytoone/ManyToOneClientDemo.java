package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.onetomany.Dept;

import com.onetomany.Faculty;

public class ManyToOneClientDemo {

	public static void main(String[] args) {
		
		jEntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Dept java = new Dept(1, "Java", 4);
		Dept python = new Dept(2, "Python", 4);
		Dept sql = new Dept(3, "SQL", 4);
		
		
		em.persist(java);
		em.persist(python);
		em.persist(sql);
		
		List<Dept> courses = new ArrayList<Dept>();
		courses.add(sql);
		courses.add(python);
		courses.add(java);
		
		
			
		Faculty st1 = new Faculty();
		st1.setId(1);
		st1.setName("Sachin");
		st1.setCourse(courses);
		
		em.persist(st1);
		
		
//		Faculty st2 = new Faculty();
//		st1.setId(2);
//		st1.setName("Rahul");
//		st1.setCourse(courses);
//		
//		Faculty st3 = new Faculty();
//		st1.setId(3);
//		st1.setName("Kumar");
//		st1.setCourse(courses);
		
		
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Inserted");
		
	}

}
