package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchData {

	public static void main(String[] args) {
		  //Step :1 Reading the details from hibernate configuration
		  Configuration conf = new Configuration();
		  conf.configure("hibernate.cfg.xml");
				
		  //Step :2 
		  SessionFactory  factory = conf.buildSessionFactory();
				
		  //Step :3
		  Session session = factory.openSession();
				
		  //Step :4 
		  //Fetch all detailed
			/*
			 * List<Student> l1 = session.createQuery("from Student",Student.class).list();
			 * 
			 * for(Student s1:l1) {
			 * System.out.println(s1.getId()+"  "+s1.getName()+"  "+s1.getAge()); }
			 */
		  
		  //For fetching a particular data
			/*
			 * Query<Student> q1 =
			 * session.createQuery("FROM Student s WHERE s.name= :n",Student.class);
			 * q1.setParameter("n", "Ram");
			 */
		  
		  //for fetching single column 
			/*
			 * Query<String> q1 = session.createQuery("SELECT s.name  FROM Student s",
			 * String.class);
			 * 
			 * List<String> list = q1.list(); for(String s1:list) { System.out.println(s1);
			 * 
			 * }
			 */
		  
		  //Fetch age greater than 35 
		  
		  Query<Student> q = session.createQuery("FROM Student s WHERE s.age > :age", Student.class);
		  q.setParameter("age", 35);
		  
		  List<Student> list1 = q.list();
		  for(Student s : list1) {
				    System.out.println(s.getId() + "  " + s.getName() + "  " + s.getAge());
				}
		  
		  session.close();
		  factory.close();
		  System.out.println("Detailes added successfully");


	}

}
