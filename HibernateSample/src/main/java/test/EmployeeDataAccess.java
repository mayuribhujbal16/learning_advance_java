package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDataAccess {

	public static void main(String[] args) 
	{
		// Step-1 Reading details from hibernate configuration file
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//Step-2 
		SessionFactory factory= conf.buildSessionFactory();
		
		//Step-3 
		Session session = factory.openSession();  // session:create new session/column in ur session in ur database
		
		//Step-4 
		Transaction tx = session.beginTransaction();
		
		//create persistance object 
		
		Employee emp = new Employee("Siya",52000);
		
		session.save(emp);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details added Successfullyyyyyyy!!!");
		
	}

}
