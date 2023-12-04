package com.HibernateProgrammers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Student.Student;

public class pragram10 {

	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements

		Student student = new Student(3,"mech","mech@gmial.com","sudarshan",80000);
		session.save(student);

		transaction.commit();

	}

}
