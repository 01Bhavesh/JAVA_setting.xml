package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.Model.Employe;

public class EmpDaoImp implements EmpDao
{
	static Connection conn ;
	static PreparedStatement getData,insert,delEmp,getById,updateEmp;
	static {
		try {
			conn = DBUtil.getByConnection();
			getData = conn.prepareStatement("select * from employe");
			insert = conn.prepareStatement("insert into employe values(?,?,?)");
			delEmp = conn.prepareStatement("delete from employe where id=?");
			getById = conn.prepareStatement("select * from employe where id=?");
			updateEmp = conn.prepareStatement("update employe set name=? , salary=? where id = ?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employe> findAllEmp() {
		List<Employe> elst = new ArrayList<>();
		try {
			ResultSet rs = getData.executeQuery();
			while(rs.next())
			{
				Employe e = new Employe(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				elst.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elst;
	}

	@Override
	public void addEmp(Employe e) {
		try {
			insert.setInt(1, e.getEid());
			insert.setString(2,e.getEname());
			insert.setDouble(3, e.getEsal());
			insert.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmp(int eid) {
		try {
			delEmp.setInt(1, eid);
			delEmp.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employe getById(int eid) {
		try {
		 getById.setInt(1, eid);
		 ResultSet rs = getById.executeQuery();
		 if(rs.next())
		 {
			 return new Employe(rs.getInt(1),rs.getString(2),rs.getDouble(3));
		 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateEmp(Employe e) {
		try {
			updateEmp.setString(1, e.getEname());
			updateEmp.setDouble(2, e.getEsal());
			updateEmp.setInt(3, e.getEid());
			updateEmp.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
