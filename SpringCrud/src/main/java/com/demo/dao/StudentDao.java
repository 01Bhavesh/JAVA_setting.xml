package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface StudentDao {

	int addStd(Student s);

	List<Student> showAll();

	int delete(int id);

	int updatedById(int id, String name, String number, String email);

	Student showById(int id);

}
