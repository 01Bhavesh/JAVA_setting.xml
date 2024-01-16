package com.demo.service;

import java.util.List;

import com.demo.model.MyUser;

public interface MyUserService {

	boolean AddUser();

	List<MyUser> Display();

	MyUser show(int id);

	boolean modifyById(int id, String unm, String street);

	boolean delete(int id);

	List<MyUser> sort();

}
