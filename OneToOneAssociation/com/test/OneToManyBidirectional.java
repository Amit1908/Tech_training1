package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class OneToManyBidirectional {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();

		
		Library library = new Library();
		library.setName("abclibrary");
		
		em.persist(library);
		
		Book bk1 = new Book();
		bk1.setBookName("Java");
		bk1.setAuthor("Bala");
		bk1.setLibrary(library);
		
		
		Book bk2 = new Book();
		bk2.setBookName("HTML");
		bk2.setAuthor("Lenda");
		bk2.setLibrary(library);
		
		em.persist(bk1);
		em.persist(bk2);
		
		em.getTransaction().commit();
		System.out.println("========inserted=========");

	}

}
