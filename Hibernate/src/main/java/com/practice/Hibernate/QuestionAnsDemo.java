package com.practice.Hibernate;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration()
	            .configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();

	    Answer ans=new Answer();
	    ans.setAnswerId(123);
	    ans.setAnswer("Java is High Level Programming Language");
	    
	    Answer ans1=new Answer();
	    ans1.setAnswerId(124);
	    ans1.setAnswer("Java helps us to create softwares");

	    Answer ans2=new Answer();
	    ans2.setAnswerId(125);
	    ans2.setAnswer("Java helps us to create softwares");
	    
	    Question q=new Question();
	    q.setQuestionId(101);
	    q.setQuestion("What is Java");
	    
	    List<Answer> list=new ArrayList<Answer>();
	    list.add(ans);
	    list.add(ans1);
	    list.add(ans2);
	    
	    q.setAnswer(list);
	   
	   
	    
	   
	   
	    
	    Session s=factory.openSession();
	    
	    Transaction tx=s.beginTransaction();
	    
	    s.save(ans);
	    s.save(ans1);
	    s.save(ans2);
	    s.save(q);
	    
	    
	    
	    
	    tx.commit();    
	  
	    
	    factory.close();
	}

}
