package com.practice.Hibernate;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{

    	public static void main(String[] args) {
    	    Configuration cfg = new Configuration()
    	            .configure("hibernate.cfg.xml");
    	    SessionFactory factory = cfg.buildSessionFactory();

    	    // Create object of Address
    	    Address add = new Address();
    	    add.setStreet("Street 1");
    	    add.setCity("Mumbai");
    	    add.setOpen(true);
    	    add.setAddedDate(new Date());
    	    add.setX(12.123);

    	    try {
    	        Session s = factory.openSession(); // Use openSession() instead

    	        s.beginTransaction();
    	        s.save(add);
    	        s.getTransaction().commit();
    	        s.close();
    	    } catch (Exception e) {
    	        System.out.println(e.getMessage());
    	    } finally {
    	        factory.close(); // It's a good practice to close the factory
    	    }
    	}
}