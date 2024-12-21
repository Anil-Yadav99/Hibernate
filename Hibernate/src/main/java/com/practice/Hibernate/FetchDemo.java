package com.practice.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration()
	            .configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    Session session=factory.openSession();
	    
	    // get studentID:101
	     Student std=session.load(Student.class, 101);
	    System.out.println(std);
	    
	    Address ad=session.get(Address.class,1);
	    System.out.println(ad);
	    factory.close();
	}

}
