package pojos;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_table")
public class AddCourse {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int course_id;
	private String course_name;
	private int course_duration;
	private int course_fees;
	private String course_teacher;
	public AddCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddCourse(int course_id, String course_name, int course_duration, int course_fees, String course_teacher) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_duration = course_duration;
		this.course_fees = course_fees;
		this.course_teacher = course_teacher;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}
	
	
	public String getCourse_teacher() {
		return course_teacher;
	}
	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}
	public int getCourse_fees() {
		return course_fees;
	}
	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}
	@Override
	public String toString() {
		return "AddCourse [course_id=" + course_id + ", course_name=" + course_name + ", course_duration="
				+ course_duration + ", course_fees=" + course_fees + ", course_teacher=" + course_teacher + "]";
	}

	
}
