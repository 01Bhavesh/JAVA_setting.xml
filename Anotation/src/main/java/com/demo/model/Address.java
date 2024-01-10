package com.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private int aid;
private String city;
private String state;
public Address() {
	super();
}
public Address(int aid, String city, String state) {
	super();
	this.aid = aid;
	this.city = city;
	this.state = state;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", city=" + city + ", state=" + state + "]";
}

}
