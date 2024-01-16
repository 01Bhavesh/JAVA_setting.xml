package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.MyUser;
import com.demo.service.MyUserService;
import com.demo.service.MyUserServiceImp;

public class TestCrud {

	public static void main(String[] args) {
		
		MyUserService mservice = new MyUserServiceImp();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
System.out.println("1.Add new User\n2.display user\n3.display by id\n4.update by id\n5.delete by id\n6.sort in acending\nExit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean status = mservice.AddUser();
				if(status)
				{
					System.out.println("succesfully added");
				}
				else
				{
					System.out.println("data not correct");
				}
				break;
			case 2:
				List<MyUser> lst = mservice.Display();
				lst.forEach(System.out::println);
				break;
			case 3:
				System.out.println("enter id which you want to display");
				int id = sc.nextInt();
				MyUser u = mservice.show(id);
				System.out.println(u);
				break;
			case 4:
				System.out.println("enetr user id to update");
				id=sc.nextInt();
				System.out.println("enetr user name to update");
				String unm=sc.next();
				System.out.println("enetr street");
				String street=sc.next();
				status=mservice.modifyById(id,unm,street);
				if(status)
				{
					System.out.println("successfully updated");
				}
				else
				{
					System.out.println("data was wrong");
				}
				break;
			case 5:
				System.out.println("enter id which you want to display");
				id = sc.nextInt();
				status = mservice.delete(id);
				if(status)
				{
					System.out.println("successfully updated");
				}
				else
				{
					System.out.println("data was wrong");
				}
				break;
			case 6:
				
				lst = mservice.sort();
				lst.forEach(System.out::println);
				break;
			case 7:
				System.out.println("thanku for investing your time");
				
				break;
			default:
				break;
			}
			
		}while(true);

	}

}
