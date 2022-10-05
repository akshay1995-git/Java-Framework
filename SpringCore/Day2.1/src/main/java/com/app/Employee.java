package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Employee {
	private int id;  
	private String name;  
	private ArrayList<Phone> phonenumbers;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, ArrayList<Phone> phone) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumbers= phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id set");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name set");

		this.name = name;
	}

	public List<Phone> getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(ArrayList<Phone> phonenumbers) {
		System.out.println("phone set");

		this.phonenumbers = phonenumbers;
	}
	public void display() {
		Iterator<Phone> itr=phonenumbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Phones are here :");  
	   display();
	}  
	
	
}
