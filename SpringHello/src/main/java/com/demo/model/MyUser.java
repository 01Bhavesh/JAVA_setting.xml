package com.demo.model;

public class MyUser {
	private int id;
	private String name;
	public MyUser() {
		System.out.println("default constructor");

	}
	public MyUser(int id, String name) {
		super();
		System.out.println("parameterize constructor");
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("set id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("set name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + "]";
	}
	

}
