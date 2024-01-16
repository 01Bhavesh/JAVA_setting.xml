package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="UserLocation")
public class Address {
@Id
private int Addr; //primary key which will going to use as foregin key for MyUser TABLE
private String city;
private String landmark;
public Address() {
	super();
}
public Address(int addr, String city, String landmark) {
	super();
	Addr = addr;
	this.city = city;
	this.landmark = landmark;
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
@Override
public String toString() {
	return "Address [Addr=" + Addr + ", city=" + city + ", landmark=" + landmark + "]";
}



}
