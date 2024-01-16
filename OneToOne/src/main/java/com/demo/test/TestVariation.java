package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestVariation {
	public static void main(String[] args)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess1 = sf.openSession();
		Transaction tr1 = sess1.beginTransaction();
		
		MyUser mu1 = sess1.get(MyUser.class, 2);
		mu1.setName("sky");
		MyUser mu2 = sess1.get(MyUser.class,1);
		mu2.setName("pant");
		
		tr1.commit();
//		
		MyUser mu3 = sess1.get(MyUser.class, 2);
		
		System.out.println("before");
		System.out.println(mu3);
		System.out.println("after");
		System.out.println(mu3.getAddr().getCity());
		sess1.close();
		
	}

}
