package com.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Emp00")
public class Employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	@JoinTable(name="EmpProj",joinColumns= {@JoinColumn(name="eid")},inverseJoinColumns = {@JoinColumn(name="pid")})
 Set<Project> pset;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Employee(int eid, String ename, Set<Project> pset) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.pset = pset;
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
	public Set<Project> getPset() {
		return pset;
	}
	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	

}
