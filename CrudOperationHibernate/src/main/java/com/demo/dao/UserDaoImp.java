package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.MyUser;

public class UserDaoImp implements UserDao{
static SessionFactory hu;
static
{
	hu = HibernateUtil.getConnection();
}
	public boolean save(MyUser u) {
		Session sess1 = hu.openSession();
		Transaction tr = sess1.beginTransaction();
		sess1.save(u);
		tr.commit();
		sess1.close();
		return true;
	}
	public List<MyUser> display() {
		Session sess1 = hu.openSession();
		Transaction tr = sess1.beginTransaction();
		Query qry = sess1.createQuery("from MyUser");
		List<MyUser> lst = qry.list();
		tr.commit();
		sess1.close();
		return lst;
	}
	@Override
	public MyUser show(int id) {
		Session sess1 = hu.openSession();
		Transaction tr = sess1.beginTransaction();
		MyUser u = sess1.get(MyUser.class, id);
		tr.commit();
		sess1.clear();
		return u;
	}
	@Override
	public boolean update(int id, String unm, String street) {
		Session sess1 = hu.openSession();
		Transaction tr = sess1.beginTransaction();
		MyUser u = sess1.get(MyUser.class, id);
		if(u!=null)
		{
		u.setUname(unm);
		u.getAddr().setStreet(street);
		sess1.update(u);
		tr.commit();
		sess1.close();
		return true;
		}
		else
		{
			sess1.close();
		return false;
	
		}}
	@Override
	public boolean delete(int id) {
		Session sess1 = hu.openSession();
		Transaction tr = sess1.beginTransaction();
		MyUser u = sess1.get(MyUser.class, id);
		if(u!=null)
		{

		sess1.delete(u);
		tr.commit();
		sess1.close();
		return true;
		}
		else
		{
			sess1.close();
		return false;
	
		}
	}
	@Override
	public List<MyUser> sort() {
		Session sess1 = hu.openSession();
		Transaction tr = sess1.beginTransaction();
		Query qry = sess1.createQuery("from MyUser u order by u.id asce ");
		List<MyUser> lst = qry.list();
		return lst;
	}
	
}
