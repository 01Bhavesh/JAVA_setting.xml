package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Animal;

public class AnimalTest {
public static void main(String[] args)
{
	Animal a1 = new Animal(1,"sharuk",63);
	Animal a2 = new Animal(2,"salman",78);
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session sess1 = sf.openSession();
	Transaction tr = sess1.beginTransaction();
	
	sess1.save(a1);
	sess1.save(a2);
	
	tr.commit();
	sess1.close();
}
}
