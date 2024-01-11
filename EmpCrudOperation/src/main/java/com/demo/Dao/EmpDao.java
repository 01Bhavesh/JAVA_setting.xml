package com.demo.Dao;

import java.util.List;

import com.demo.Model.Employe;

public interface EmpDao {

	List<Employe> findAllEmp();

	void addEmp(Employe e);

	void deleteEmp(int eid);

	Employe getById(int eid);

	void updateEmp(Employe e);

}
