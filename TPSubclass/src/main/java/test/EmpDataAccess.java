package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDataAccess {

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
		emp.setName("Riya");
		
		Reg_emp emp1 = new Reg_emp();
		emp1.setName("Siya");
		emp1.setSalary(40000);
		emp1.setBouns(5);
		
		Contract_emp emp2 = new Contract_emp();
		emp2.setName("Jiya");
		emp2.setPay_per_hour(10);
		emp2.setContract_period("15 hours");
		
		session.persist(emp);
		session.persist(emp1);
		session.persist(emp2);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Detailes added successfully");
		

	}

}
