package service;

import java.util.List;

import pojos.AddCourse;

public interface ICourseService {

	public int add_course(AddCourse course);
	
	public List<AddCourse> get_all_courses();
}
