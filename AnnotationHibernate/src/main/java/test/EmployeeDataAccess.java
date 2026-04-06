package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDataAccess {

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
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("John");
		emp.setSalary(60000);
		
		session.save(emp);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Detailes added successfully");
		
	}

}
