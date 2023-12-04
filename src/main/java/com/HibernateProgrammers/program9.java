package com.HibernateProgrammers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Student.Student;

public class program9 {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		String sql ="update Student set name=:n where id=:i";
		
		
		
		Query query = session.createQuery(sql);
		query.setParameter("n", "uppalbalu");
		query.setParameter("i", 4);
	
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		transaction.commit();

	}

}
