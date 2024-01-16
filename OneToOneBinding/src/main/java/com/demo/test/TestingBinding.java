package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;

public class TestingBinding {
public static void main(String[] args)
{
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess1 = sf.openSession();
	Transaction tr1 = sess1.beginTransaction();
	
	Address a1 = sess1.get(Address.class, 100);
	
	System.out.println(a1.getU().getName());
	
}
}
