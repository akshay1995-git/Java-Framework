package pojo;

import java.util.Arrays;

public class Application {
	
	private String name;
	private String email;
	private String password;
	private String dob;
	private String phone;
	private String gender;
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
