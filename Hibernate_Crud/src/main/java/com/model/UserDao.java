package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class UserDao {
	private SessionFactory factory; // Corrected to use class-level variable
	
	public UserDao(){
		Configuration cfg = new Configuration();
		cfg.configure("Hiber.cfg.xml");
		this.factory = cfg.buildSessionFactory(); // Initialize class-level factory variable
		
	}
             
	
	
	public void insert(Student s){
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		
	}
	
   public Student Select(int id){
	   Session session = factory.openSession();
	   Transaction tx = session.beginTransaction();
       Student s = session.get(Student.class,id);
       tx.commit();
	   return s;
   }
   
   public void update(Student s){
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       session.update(s);
       tx.commit();
	  
   }
   public void Delete(int id){
	   Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       Student s = session.get(Student.class,id);
       session.delete(s);
       tx.commit();
   }
   
   
	
}
