package com.techment;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//class cast exception
public class RetrieveDemo2 {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Student> query = session.createQuery("select s.studentId,s.name from Student s");
		List<Student> stu = query.list();
		
		System.out.println(stu.size());
		System.out.println(stu.get(1));
		
		
		session.close();
		sessionFactory.close();
		
		
		

	}

}
