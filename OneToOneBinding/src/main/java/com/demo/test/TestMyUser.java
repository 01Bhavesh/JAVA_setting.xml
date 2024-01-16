package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUser {
public static void main(String[] args)
{
	Address a1 = new Address(100,"pune","DagdushethGanpati");
	Address a2 = new Address();
	a2.setAddr(200);
	a2.setCity("mumbai");
	a2.setLandmark("GetOfIndia");
	
	MyUser u1 = new MyUser(1,"Virat",a1);
	MyUser u2 = new MyUser(2,"Rohit",a2);
	
	a1.setU(u1);
	a1.setU(u2);
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess1 = sf.openSession();
	Transaction tr = sess1.beginTransaction();
	
	
	sess1.save(a1);
	sess1.save(a2);
	sess1.save(u1);
	sess1.save(u2);
	
	tr.commit();
	
	sess1.close();
}
}
