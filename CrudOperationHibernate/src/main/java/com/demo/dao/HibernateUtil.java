package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
static SessionFactory sf;
static SessionFactory getConnection()
{
	if(sf==null)
	{
		sf = new Configuration().configure().buildSessionFactory();
		return sf;
	}	
	else
	{
		return sf;
	}
}
static void closeConnection()
{
	if(sf != null)
	sf.close();
}
}
