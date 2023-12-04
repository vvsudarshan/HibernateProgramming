package com.HibernateProgrammers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Student.Student;

public class program5 {

	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		Student s= session.get(Student.class, 3);
		s.setName("Virat");
		s.setEmail("virat@gmail.com");
		s.setSalary(50);

		transaction.commit();

	}

}
