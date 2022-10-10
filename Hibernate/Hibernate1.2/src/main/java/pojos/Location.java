package pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="location_tbl")
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="location_id")
	private int id;
	@Column(name="location_name")
	private String loc_name;
	@Column(name="location_head")
	private String loc_head;
	
	@ManyToMany(mappedBy="locations")
	List<Employee> employee;

	
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(int id, String loc_name, String loc_head, List<Employee> employee) {
		super();
		this.id = id;
		this.loc_name = loc_name;
		this.loc_head = loc_head;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoc_name() {
		return loc_name;
	}

	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}

	public String getLoc_head() {
		return loc_head;
	}

	public void setLoc_head(String loc_head) {
		this.loc_head = loc_head;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", loc_name=" + loc_name + ", loc_head=" + loc_head + ", employee=" + employee
				+ "]";
	}
	
}
