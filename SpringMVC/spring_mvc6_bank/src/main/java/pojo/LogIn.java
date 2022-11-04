package pojo;

public class LogIn {

	private String email;
	
	private String password;

	public LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LogIn(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "LogIn [email=" + email + ", password=" + password + "]";
	}
	
	
}
