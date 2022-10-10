package pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Employee_id")
	private int id;
	@Column(name="Employee_Name")
	private String name;
	
	//One To One Relationship
	@OneToOne
	@JoinColumn(name="Designation_id")
	Designation designation;
	
   //One To Many Relationship
	@OneToMany(mappedBy="employee")
	//@JoinColumn(name="project_id")
	private List<Project> projects;
	
	//Many To Many Relationship
	@ManyToMany
//	@JoinColumn(name="locations")
	private List<Location> locations;
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int id, String name, Designation designation, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.projects = projects;
	}

	public Employee(int id, String name, Designation designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public Employee(int id, String name, List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
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

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
}
