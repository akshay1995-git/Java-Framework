package com.app.pojo;

public class Employee {

	private int id;
	private String name;
	private String company_name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
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

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public Employee(int id, String name, String company_name) {
		super();
		this.id = id;
		this.name = name;
		this.company_name = company_name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company_name=" + company_name + "]";
	}

	
}
