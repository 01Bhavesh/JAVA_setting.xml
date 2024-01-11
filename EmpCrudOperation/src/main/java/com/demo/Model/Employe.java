package com.demo.Model;

public class Employe {

	private int eid;
	private String ename;
	private double esal;
	
	
	
	public Employe(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	
}
