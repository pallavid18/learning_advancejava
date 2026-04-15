package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDataAccess {

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
		
		session.save(new Student("Pawan",32));
		session.save(new Student("Ram",30));
		session.save(new Student("Sagar",38));
		session.save(new Student("Raj",35));
		session.save(new Student("Tom",42));
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Detailes added successfully");


	}

}
