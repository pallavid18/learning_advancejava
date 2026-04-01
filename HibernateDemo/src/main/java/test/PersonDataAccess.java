package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDataAccess {
	
public static void main(String[] args) {
		
		//Step :1 Reading the details from hibernate configuration
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//Step :2 
		SessionFactory  factory = conf.buildSessionFactory();
		
		//Step :3
		Session session = factory.openSession();
		
		//Step :4 
		Transaction tx = session.beginTransaction();
		
		//Step :5 Create the persistance object 
		Person p1 = new Person("Raj", 20, "Pune",50000);
		session.save(p1);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Detailes added successfully");
		
	}

}
