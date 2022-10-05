package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
//forcefully emp is ref of Employee class bydefault name is class name in smaller case
public class Employee {
	@Value("10001")
	private int id;
	@Value("akshay")
	private String name;
	@Value("#{templist}")//add list create standlone list
	private List<String> addressess;

	public Employee() {
		System.out.println("default constructor setter based injection");
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

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

	public List<String> getAddressess() {
		return addressess;
	}

	public void setAddressess(List<String> addressess) {
		this.addressess = addressess;
	}

	public void show() {
		System.out.println(id + " " + name);
		// System.out.println(address.toString());
	}

	public void init() throws Exception {
		System.out.println("Bean Employee has been " + "instantiated and I'm " + "the init() method");
	}

// This method executes
// when the spring container
// is closed
	public void destroy() throws Exception {
		System.out.println("Container has been closed " + "and I'm the destroy() method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addressess=" + addressess + "]";
	}
	
}
