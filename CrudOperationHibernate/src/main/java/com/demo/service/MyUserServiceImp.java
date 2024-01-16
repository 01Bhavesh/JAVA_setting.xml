package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImp;
import com.demo.model.Address;
import com.demo.model.MyUser;

public class MyUserServiceImp implements MyUserService {
	private UserDao dao;
	public MyUserServiceImp()
	{
		dao = new UserDaoImp();
	}

	public boolean AddUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		
		int id = sc.nextInt();
	
		System.out.println("enter your name");
		String str = sc.next();
		System.out.println("address id");
		int aid = sc.nextInt();

		System.out.println("enter your street name");
		String street = sc.next();
		System.out.println("enter your city name");
		String city = sc.next();
		MyUser u = new MyUser(id,str,new Address(aid,street,city));
		
		return dao.save(u);
	}

	public List<MyUser> Display() {
		
		return dao.display();
	}

	@Override
	public MyUser show(int id) {
		
		return dao.show(id);
	}

	@Override
	public boolean modifyById(int id, String unm, String street) {
		
		return dao.update(id,unm,street);
	}

	@Override
	public boolean delete(int id) {
		
		return dao.delete(id);
	}

	@Override
	public List<MyUser> sort() {
		
		return dao.sort();
	}

}
