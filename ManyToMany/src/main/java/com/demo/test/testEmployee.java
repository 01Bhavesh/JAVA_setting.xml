package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.Project;

public class testEmployee {
public static void main(String[] args)
{
	Employee e1 = new Employee(10,"rakesh");
	Employee e2 = new Employee(11,"ramesh");
	Employee e3 = new Employee(12,"sharukh");
	Employee e4 = new Employee(20,"kunal");
	Employee e5 = new Employee(21,"saurabh");
	
	Set<Employee> elst = new HashSet<Employee>();
	elst.add(e1);
	elst.add(e2);
	elst.add(e5);
	
	Set<Employee> elst1 = new HashSet<Employee>();
	elst1.add(e3);
	elst1.add(e4);
	elst1.add(e5);
	
	Project p1 = new Project(100,"ML");
	Project p2 = new Project(200,"ParkingTips");
	Project p3 = new Project(300,"CC");
	
	p1.setEset(elst);
	p2.setEset(elst1);
	p3.setEset(elst);
	
	Set<Project> plst = new HashSet<Project>();
	plst.add(p1);
	plst.add(p2);
	
	Set<Project> pst1 = new HashSet<Project>();
	pst1.add(p2);
	pst1.add(p3);
	
	
	
	
	e1.setPset(plst);
	e2.setPset(plst);
	e3.setPset(pst1);
	e4.setPset(pst1);
	
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess1 = sf.openSession();
	Transaction tr = sess1.beginTransaction();
	
	sess1.save(e1);
	sess1.save(e2);
	sess1.save(e3);
	sess1.save(e4);
	sess1.save(e5);
	sess1.save(p1);
	sess1.save(p2);
	sess1.save(p3);
	tr.commit();
	
	
	
}
}
