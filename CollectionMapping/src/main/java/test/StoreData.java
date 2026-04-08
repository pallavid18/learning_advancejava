package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

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
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Java is Programming Language");
		l1.add("Java is platform independent");
		l1.add("Java is secure language");
		l1.add("Java is object oriented language");
		Question q1 = new Question();
		q1.setQname("What is java");
		q1.setAnswers(l1);
		
        session.save(q1);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Detailes added successfully");
		
	}

}
