package com.app;

public class Employee {
	private int id;  
	private String name;  
	//Employe class object depend  on Address class
	private Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void setAddress(Address address) {
		System.out.println("Dependency injected by setter ");
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}  
	
	  
}
