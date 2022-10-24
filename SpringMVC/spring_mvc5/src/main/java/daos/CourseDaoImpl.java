package daos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pojos.AddCourse;

@Repository
public class CourseDaoImpl implements ICouseDao {

	@Autowired
	HibernateTemplate hibernatetemplate;

	@Transactional
	public int add_course_detail(AddCourse course) {

		int rs = (Integer) this.hibernatetemplate.save(course);
		return rs;
	}

	public List<AddCourse> get_all_course() {
		List<AddCourse> courses=this.hibernatetemplate.loadAll(AddCourse.class);
		return courses;
	}

//	@Transactional
//	public AddCourse get_course_detail() {
//		AddCourse course=this.hibernatetemplate.get(AddCourse.class,)
//		return null;
//	}

}
