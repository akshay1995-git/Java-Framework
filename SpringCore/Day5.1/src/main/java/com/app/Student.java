package com.app;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("student")
public class Student {
	
	@Value("1001")
	private int id;
	@Value("Akshay")
	private String name;
	@Value("23000")
	private double fees;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

}
