package com.HibernateProgrammers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Student.Student;

public class program11 {


	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		//logic implements
		try {

			String hql = "FROM Student WHERE name = :name";
	        Query<Student> query = session.createQuery(hql, Student.class);
	        query.setParameter("name", "uppalbalu");

	        List<Student> resultList = query.getResultList();

	        for (Student student : resultList) {
	            System.out.println(student.getDepartment()+" "+student.getSalary());
	        }

			transaction.commit();
		}
		catch (Exception e) {
			System.out.println("nott findd");
		}

	}

}
