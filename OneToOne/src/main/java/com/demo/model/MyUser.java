package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserDetail")
public class MyUser {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="uname")
	private String name;
	@OneToOne
	private Address addr;  //foregin key of Table Address
	public MyUser() {
		super();
	}
	public MyUser(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	

}
