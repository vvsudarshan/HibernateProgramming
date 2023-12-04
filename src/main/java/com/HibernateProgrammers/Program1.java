package com.HibernateProgrammers;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Student.Student;

public class Program1 {

    public static void main(String[] args) {
    	SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		Student student = session.get(Student.class, 4);
		System.out.println(student);
		
		
		
		
		
		
		
		
		
		
		
		
		transaction.commit();
    	
   	
    	
        
      
    }
}
