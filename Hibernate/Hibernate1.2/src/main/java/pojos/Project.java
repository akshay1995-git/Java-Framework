package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="project_tbl")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="project_id")
	private int id;
	@Column(name="project_name")
	private String project_name;
	@Column(name="project_client")
	private String project_client;
	

	@ManyToOne
	Employee employee;
	

	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Project(int id, String project_name, String project_client, Employee employee) {
		super();
		this.id = id;
		this.project_name = project_name;
		this.project_client = project_client;
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String project_name, String project_client) {
		super();
		this.id = id;
		this.project_name = project_name;
		this.project_client = project_client;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_client() {
		return project_client;
	}
	public void setProject_client(String project_client) {
		this.project_client = project_client;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", project_name=" + project_name + ", project_client=" + project_client + "]";
	}
	
	

}
