package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	int addNewStd();

	List<Student> Display();

	int deleteById(int id);

	int modify(int id, String name, String number, String email);

	Student displayById(int id);

}
