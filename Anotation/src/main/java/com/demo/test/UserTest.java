package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.User;

public class UserTest {
public static void main(String[] args)
{
	Address a1 = new Address(1,"pune","maharashtra");
	Address a2 = new Address(2,"mumabi","maharashtra");
	
	User u1 = new User(10,"kiran",a1);
	User u2 = new User(20,"bhavesh",a2);
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess1 = sf.openSession();
	Transaction tr = sess1.beginTransaction();
	
	sess1.save(u1);
	sess1.save(u2);
	
	tr.commit();
	sess1.close();
}
}
