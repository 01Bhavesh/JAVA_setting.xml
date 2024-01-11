package com.demo.Service;

import java.util.List;

import com.demo.Dao.EmpDao;
import com.demo.Dao.EmpDaoImp;
import com.demo.Model.Employe;

public class EmployeServiceImpl implements EmployeService
{
	private EmpDao edao;
public EmployeServiceImpl()
{
		super();
		this.edao = new EmpDaoImp();
}
	@Override
	public List<Employe> getAllEmp() {
		return edao.findAllEmp();
	
}
	@Override
	public void addEmp(Employe e) {
		edao.addEmp(e);
		
	}
	@Override
	public void deleteEmp(int eid) {
		edao.deleteEmp(eid);
		
	}
	@Override
	public Employe getById(int eid) {
		return edao.getById(eid);
		
	}
	@Override
	public void updateEmp(Employe e) {
		 edao.updateEmp(e);
		
	}
}