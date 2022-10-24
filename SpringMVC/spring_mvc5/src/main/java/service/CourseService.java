package service;





import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.ICouseDao;
import pojos.AddCourse;

@Service
@Transactional
public class CourseService implements ICourseService {

	@Autowired
	private ICouseDao courseDao;
	
	
	public int add_course(AddCourse course) {
		
		return courseDao.add_course_detail(course);
	}


	public List<AddCourse> get_all_courses() {
		return this.courseDao.get_all_course();
		
	}
	

}
