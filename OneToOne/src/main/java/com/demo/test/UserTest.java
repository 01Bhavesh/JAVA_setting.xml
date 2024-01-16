package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class UserTest {
public static void main(String[] args)
{
	Address a1 = new Address(100,"pune","DagdushethGanpati");
	Address a2 = new Address(101,"Navi-Mumbai","DY_Patil_Stadium");
	
	MyUser u1 = new MyUser(1,"Virat",a1);
	MyUser u2 = new MyUser(2,"Rohit",a2);
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess1 = sf.openSession();
	Transaction tr1 = sess1.beginTransaction();
	
	sess1.save(a1);
	sess1.save(a2);
	
	tr1.commit();
	
	
	
	Transaction tr2 = sess1.beginTransaction();
	sess1.save(u1);
	sess1.save(u2);
	
	tr2.commit();
	
	
	
	sess1.close();
}
}
