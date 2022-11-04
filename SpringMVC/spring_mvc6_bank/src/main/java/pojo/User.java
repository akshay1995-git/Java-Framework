package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Table")
public class User {
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;
	@Column(name="User_Name")
	private String name;
	@Column(name="User_Email")
	private String email;
	@Column(name="User_Password")
	private String password;
	@Column(name="User_Gender")
	private String gender;
	@Column(name="User_Dob")
	private String dob;
	@Column(name="User_Phone")
	private String phone;
	//Mapping
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Account_No")	
	Account account;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String name, String email, String password, String gender, String dob, String phone) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public User(int user_id, String name, String email, String password, String gender, String dob, String phone,
			Account account) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
		this.account = account;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", dob=" + dob + ", phone=" + phone + ", account=" + account + "]";
	}
	
	

}
