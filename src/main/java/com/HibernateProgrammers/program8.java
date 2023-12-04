package com.HibernateProgrammers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Student.Student;

public class program8 {

	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		String hql="delete Student s where s.salary>1000";
		Query query = session.createQuery(hql);
		int i = query.executeUpdate();
		System.out.print(i);
		
		

		transaction.commit();
	}

}
