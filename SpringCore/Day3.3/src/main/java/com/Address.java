package com;

public class Address {
	private String city;
	private String state;
	private String country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return city + " " + state + " " + country;
	}

	public void init() throws Exception {
		System.out.println("Bean Address has been " + "instantiated and I'm " + "the init() method");
	}

// This method executes
// when the spring container
// is closed
	public void destroy() throws Exception {
		System.out.println("Container has been closed " + "and I'm the destroy() method");
	}
}
