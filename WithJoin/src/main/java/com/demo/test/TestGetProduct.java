package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Perishable;

public class TestGetProduct {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Perishable p=session.get(Perishable.class, 110);
		System.out.println(p);
		tr.commit();
		session.close();
		sf.close();
//		System.out.println(p);

	}

}
