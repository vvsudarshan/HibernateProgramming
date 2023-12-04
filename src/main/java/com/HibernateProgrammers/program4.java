package com.HibernateProgrammers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Student.Student;

public class program4 {

	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		Query query = session.createQuery("from Student where salary>=40000");
		List Students = query.getResultList();
		for(Object s:Students) {
			System.out.println(s);
		}
		transaction.commit();
	}

}
