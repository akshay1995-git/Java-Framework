package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//will create table in DB having column as member variable i.e class mapped in database
@Table(name="student_tbl")//giving table name in database that it create using Entity
public class Student {

	@Id//to set given column as primary key in student_tbl
	private int stu_Id;
	private String name;
	private String city;
	private double fees;
	public Student(int stu_Id, String name, String city, double fees) {
		super();
		this.stu_Id = stu_Id;
		this.name = name;
		this.city = city;
		this.fees = fees;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStu_Id() {
		return stu_Id;
	}
	public void setStu_Id(int stu_Id) {
		this.stu_Id = stu_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [stu_Id=" + stu_Id + ", name=" + name + ", city=" + city + ", fees=" + fees + "]";
	}
	
}
