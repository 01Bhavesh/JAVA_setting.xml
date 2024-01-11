package com.demo.Service;

import java.util.List;

import com.demo.Model.Employe;

public interface EmployeService {

	List<Employe> getAllEmp();

	void addEmp(Employe e);

	void deleteEmp(int eid);

	Employe getById(int eid);

	void updateEmp(Employe e);

}
