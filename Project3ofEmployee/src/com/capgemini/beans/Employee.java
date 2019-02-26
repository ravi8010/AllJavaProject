package com.capgemini.beans;

public class Employee {
	private String name;
	private int id;
	Address addres;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Address getAddres() {
		return addres;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	public Employee(String name, int id, Address addres) {
		super();
		this.name = name;
		this.id = id;
		this.addres = addres;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", addres=" + addres + "]";
	}
	

}
