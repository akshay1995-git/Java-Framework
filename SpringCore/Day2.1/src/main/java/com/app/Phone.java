package com.app;

import java.util.ArrayList;


public class Phone {

	String phonenumbers;

	

	public Phone(String phonenumber) {
		super();
		this.phonenumbers = phonenumber;
	}



	@Override
	public String toString() {
		return "Phone [phonenumber=" + phonenumbers + "]";
	}



	public String getPhonenumbers() {
		return phonenumbers;
	}



	public void setPhonenumbers(String phonenumber) {
		this.phonenumbers= phonenumber;
	}



	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	
	
}
