package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;

public class testSpring {
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");
	StudentService ss = (StudentService) ac.getBean("studentServiceImp");
	Scanner sc = new Scanner(System.in);
	int choice ;
	do {
		System.out.println("1. add new Student\n 2. delete Student by id\n 3. modify Student");
		System.out.println("4. display all\n5.display by id\n7.exit");
		System.out.println("choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int n = ss.addNewStd();
			if(n>0)
			{
				System.out.println("added successfully");
			}
			break;
		case 2:
			System.out.println("enter id");
			int id = sc.nextInt();
			int status = ss.deleteById(id);
			System.out.println(status); //1
			if(status>0)
			{
				System.out.println("deleted successfully");
				
			}else
				{
				System.out.println("data was wrong");
				}
				
			break;
		case 3:
			System.out.println("enter id");
			id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter phone number");
			String number = sc.next();
			System.out.println("enter email");
			String email = sc.next();
			Student s = new Student(id,name,number,email);
			n = ss.modify(id,name,number,email);
			if(n>0)
			{
				System.out.println("updated successfully");
			}
			else
			{
				System.out.println("data incorrect");
			}
			break;
		case 4:
			List<Student> lst= ss.Display();
			lst.forEach(System.out::println);
			break;
		case 5:
			System.out.println("enter id");
			 id = sc.nextInt();
			 Student s1 = ss.displayById(id);
			 System.out.println(s1);
			break;
		case 6:
			System.out.println("thanks you");
			break;
			default:
				break;
		}
		
	}while(choice!=6);
}
}
