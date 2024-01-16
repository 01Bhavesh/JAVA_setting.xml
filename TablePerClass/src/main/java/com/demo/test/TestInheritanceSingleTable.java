package com.demo.test;



import org.hibernate.cfg.Configuration;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.NonPerishableProduct;
import com.demo.model.Perishable;
import com.demo.model.Product;

public class TestInheritanceSingleTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=new Product(11,"Pen",new Date());
		Perishable p1=new Perishable(110,"Biscuits", new Date(), new Date());
		NonPerishableProduct p2=new NonPerishableProduct(130,"Chair",new Date(),"Furniture");
		session.save(p2);
		session.save(p1);
		session.save(p);
		tr.commit();

	}

}
