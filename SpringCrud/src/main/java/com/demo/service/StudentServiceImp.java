package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentDao stdDao;
	
	public int addNewStd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter phone number");
		String number = sc.next();
		System.out.println("enter email");
		String email = sc.next();
				Student s = new Student(id,name,number,email);
		return stdDao.addStd(s);
	}

	public List<Student> Display() {
		// TODO Auto-generated method stub
		return stdDao.showAll();
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return stdDao.delete(id);
	}

	@Override
	public int modify(int id, String name, String number, String email) {
		// TODO Auto-generated method stub
		return stdDao.updatedById(id,name,number,email);
	}

	@Override
	public Student displayById(int id) {
		// TODO Auto-generated method stub
		return stdDao.showById(id);
	}

}
