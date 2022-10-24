package daos;

import java.util.List;

import pojos.AddCourse;

public interface ICouseDao {
	
	public int add_course_detail(AddCourse course);
	
	//public AddCourse get_course_detail();
	
	public List<AddCourse> get_all_course();

}
