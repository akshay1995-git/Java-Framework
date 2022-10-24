package pojo;

import java.util.Arrays;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application_tbl")
public class Application {
	@Id
	@Column(name="Applicant_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Applicant_name")
	private String name;
	@Column(name="Applicant_email")
	private String email;
	@Column(name="Applicant_password")
	private String password;
	@Column(name="Applicant_dob")
	private String dob;
	@Column(name="Applicant_phone")
	private String phone;
	@Column(name="Applicant_gender")
	private String gender;
	@Column(name="Applicant_Courses")
	private String[] course;

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Application(String name, String email, String password, String dob, String phone, String gender,
			String[] course) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
		this.course = course;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob + ", phone="
				+ phone + ", gender=" + gender + ", course=" + Arrays.toString(course) + "]";
	}
	
	

}
