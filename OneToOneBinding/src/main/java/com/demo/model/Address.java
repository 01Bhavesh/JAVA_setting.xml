package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="address1")
public class Address {
@Id
private int Addr; //primary key which will going to use as foregin key for MyUser TABLE
private String city;
private String landmark;
@OneToOne(mappedBy="addr")
private MyUser u;
public Address() {
	super();
}
public Address(int addr, String city, String landmark) {
	super();
	Addr = addr;
	this.city = city;
	this.landmark = landmark;
}

public Address(int addr, String city, String landmark, MyUser u) {
	super();
	Addr = addr;
	this.city = city;
	this.landmark = landmark;
	this.u = u;
}
public int getAddr() {
	return Addr;
}
public void setAddr(int addr) {
	Addr = addr;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}

public MyUser getU() {
	return u;
}
public void setU(MyUser u) {
	this.u = u;
}
@Override
public String toString() {
	return "Address [Addr=" + Addr + ", city=" + city + ", landmark=" + landmark + "]";
}



}
