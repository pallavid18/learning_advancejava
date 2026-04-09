package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// Step :1 Reading the details from hibernate configuration
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		// Step :2
		SessionFactory factory = conf.buildSessionFactory();

		// Step :3
		Session session = factory.openSession();

		// Step :4
		Transaction tx = session.beginTransaction();

		Answer ans1 = new Answer();
		ans1.setAnsname("Java is Programming Language");
		ans1.setPostedby("Chandani Gupta");

		Answer ans2 = new Answer();
		ans2.setAnsname("Java is platform independent");
		ans2.setPostedby("Rakesh Sharma");

		Question q1 = new Question();
		q1.setQname("What is Java");
	 
		/*
		 * ArrayList<Question> q2 = new ArrayList<Question>(); q2.add(q1);
		 */
		 ArrayList<Answer> a1 = new ArrayList<Answer>();
		 a1.add(ans1);
	     a1.add(ans2);
	     
		 q1.setAnswers(a1);
		 
		 Answer ans3 = new Answer();
		 ans3.setAnsname("Servlet is API");
		 ans3.setPostedby("Chandani Joshi");

		 Answer ans4 = new Answer();
		 ans4.setAnsname("Servlet is Interface");
		 ans4.setPostedby("Mayur Varma");

		 Question q2 = new Question();
		 q2.setQname("What is Servlet");
		 ArrayList<Answer> a2 = new ArrayList<Answer>();
		 a2.add(ans3);
	     a2.add(ans4);
	     q2.setAnswers(a2);
	     
		 session.persist(q1); 
		 session.persist(q2); 

		 tx.commit();
		 session.close();
		 factory.close();
		 System.out.println("Detailes added successfully");

	}

}
