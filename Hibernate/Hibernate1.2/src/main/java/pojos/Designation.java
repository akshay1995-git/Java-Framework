package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Designation_tbl")
public class Designation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Designation_id")
	private int id;
	@Column(name="Designation")
	private String designation;
	@OneToOne(mappedBy="designation")
	Employee employee;
	public Designation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Designation(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Designation [id=" + id + ", designation=" + designation + "]";
	}
	
	
	
}
