package com.practice.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbadeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	    Configuration cfg = new Configuration()
    	            .configure("hibernate.cfg.xml");
    	    SessionFactory factory = cfg.buildSessionFactory();
           
    	    Certificate cer=new Certificate();
    	    cer.setCourse("Hibernate");
    	    cer.setDuration("12 Hrs");
    	    
    	    Certificate cer1=new Certificate();
    	    cer1.setCourse("AI");
    	    cer1.setDuration("24 Hrs");
    	    
    	    Student std=new Student();
    	    std.setId(2);
    	    std.setName("Vaayu");
    	    std.setCity("Jogeshwari");
    	    std.setCerti(cer);
    	    
    	    Student std1=new Student();
    	    std1.setId(3);
    	    std1.setName("Jyoti");
    	    std1.setCity("Airoli");
    	    std1.setCerti(cer1);
    	    
    	    Session s=factory.openSession();
    	    
    	    Transaction tx=s.beginTransaction();
    	    
    	    s.save(std);
    	    s.save(std1);
    	    
    	    tx.commit();
    	    
    	    factory.close();
	}

}
