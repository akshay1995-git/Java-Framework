package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account_table")
public class Account {
	
	@Column(name="Acc_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Id//primary key
	@Column(name="Account_No",unique=true)
    private String accNo;
	@Column(name="Type")
	private AccountType type;
	@Column(name="Balence")
	private double balence;
	//Mapping 
	@OneToOne(mappedBy = "account")
	User user;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String accNo, AccountType type, double balence) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.type = type;
		this.balence = balence;
	}
	
	
	public Account(int id, String accNo, AccountType type, double balence, User user) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.type = type;
		this.balence = balence;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accNo=" + accNo + ", type=" + type + ", balence=" + balence + ", user=" + user
				+ "]";
	}
	
	
}