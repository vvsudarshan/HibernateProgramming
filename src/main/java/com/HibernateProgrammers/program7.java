package com.HibernateProgrammers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Student.Student;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		Student s = session.get(Student.class, 3);
		session.delete(s);
		

		

		transaction.commit();

	}

}
