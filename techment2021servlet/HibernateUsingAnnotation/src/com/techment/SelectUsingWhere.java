package com.techment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectUsingWhere {

	public static void main(String[] args) {
		

		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query qry = session.createQuery("select s from Student s where s.dept=?");
		qry.setParameter(0, "hr");
		
		List<Student> list = qry.getResultList();
		
		list.forEach(s->System.out.println(s.getStudentId() + " " + s.getName()+ " " + s.getDept()));
		
		
		
		

		session.close();
		sessionFactory.close();
	}

}
