package com;

import java.util.Iterator;
import java.util.List;


public class EmployeeList {
	private int id;  
	private String name;  
	private List<Address> address;
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

	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public EmployeeList(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public EmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		Iterator<Address> itr=address.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void show(){  
	    System.out.println(id+" "+name);  
	    display();
	}
}
