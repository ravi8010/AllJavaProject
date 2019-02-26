package com.capgemini.beans;

public class Address {
	String addressLine;
	Country country;
	public String getAddressLine() {
		return addressLine;
	}
	public Country getCountry() {
		return country;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", country=" + country + "]";
	}
	public Address(String addressLine, Country country) {
		super();
		this.addressLine = addressLine;
		this.country = country;
	}
	

}
