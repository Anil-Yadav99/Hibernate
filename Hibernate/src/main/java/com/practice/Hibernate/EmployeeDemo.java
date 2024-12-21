package com.practice.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration()
	            .configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    Employee emp=new Employee();
	    emp.setEid(1);
	    emp.setEname("Jyoti");
	    Employee emp1=new Employee();
	    emp1.setEid(2);
	    emp1.setEname("Vaayu");
	    
	    Project p=new Project();
	    p.setPid(101);
	    p.setPname("AI");
	    
	    Project p1=new Project();
	    p1.setPid(102);
	    p1.setPname("JAVA");
	    
	    List<Employee> em=new ArrayList<Employee>();
	    List<Project> pr=new ArrayList<Project>();
	    
	    em.add(emp);
	    em.add(emp1);
	    
	    pr.add(p);
	    pr.add(p1);
	    
	    emp.setProject(pr);
	    p1.setEmp(em);
	    
	    
	    Session s=factory.openSession();
	    Transaction tx=s.beginTransaction();
	    
	    s.save(emp);
	    s.save(emp1);
	    s.save(p);
	    s.save(p1);
	    
	    tx.commit();
	    factory.close();
	}

}
