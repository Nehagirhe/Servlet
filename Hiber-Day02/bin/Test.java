

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Teacher;



public class Test {

	public static <R> void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hiber.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//Teacher t=new Teacher(101,"Ram","Java");
		
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from model.Teacher");
		//query.setParameter("id", )
		ArrayList<Teacher> tl=(ArrayList<Teacher>)query.list();
		
		for(Teacher t:tl){
			System.out.println(t);
		}
		//session.save(t);
		tx.commit();
		session.close();
		
		System.out.println("Data Inserted");
	}

}
