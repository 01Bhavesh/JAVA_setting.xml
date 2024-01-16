package com.demo.dao;

import java.util.List;

import com.demo.model.MyUser;

public interface UserDao {

	boolean save(MyUser u);

	List<MyUser> display();

	MyUser show(int id);

	boolean update(int id, String unm, String street);

	boolean delete(int id);

	List<MyUser> sort();


}
