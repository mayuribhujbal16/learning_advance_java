package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDataAccess {

	public static void main(String[] args) 
	{
		//step-1 Reading details from hibernate configuration file
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//s2
		SessionFactory factory = conf.buildSessionFactory();
		
		//s3
		Session session = factory.openSession();
		
		//s4
		Transaction tx = session.beginTransaction();
		
		//create persistance obj
		
		Person p = new Person("Mayuri", 21, "Pune",50000);
		
		session.save(p);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details added Successfullyyyyy!!!");
		
		
		
		

	}

}
