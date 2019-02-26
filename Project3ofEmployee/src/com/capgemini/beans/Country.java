package com.capgemini.beans;

public class Country {
	String cname;
	City city;
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + ", city=" + city + "]";
	}
	public City getCity() {
		return city;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Country(String cname, City city) {
		super();
		this.cname = cname;
		this.city = city;
	}
	public void setCity(City city) {
		this.city = city;
	}

}
