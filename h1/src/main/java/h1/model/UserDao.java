package h1.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
private SessionFactory factory;

public UserDao() {
	 try 
	 {
	Configuration cfg=new Configuration();
	cfg.configure("hiber.cfg.xml");
	this.factory=cfg.buildSessionFactory();
	}
	 catch(Throwable ex) {
		throw new ExceptionInInitializerError(ex);
	}
}
public void insert(User u) {
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(u);
	tx.commit();
}
public User select(int id) {
	Session session =factory.openSession();
	Transaction tx=session.beginTransaction();
	User u=session.get(User.class, id);
	tx.commit();
	return u;
}
public void update(User u) {
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.update(u);
	tx.commit();
}
public void delete(int id) {
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	User u=session.get(User.class, id);
	session.delete(u);
	tx.commit();
}
}
