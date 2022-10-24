package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojos.AddCourse;
import service.ICourseService;


@Controller
@RequestMapping("/home")
public class Home_Controller {
	
	@Autowired
	private ICourseService courseService;

	@GetMapping("/")
	public String homePage() {
		System.out.println("in home page...");

		return "home";
	}

	@GetMapping("/courses")
	public String showCourses() {
		System.out.println("in course page...");

		return "courses";

	}
	
	@GetMapping("/addcourse")
	public String addCourse() {
		System.out.println("in course page...");

		return "addcourse";
	}

	
	@PostMapping("/verify_course")
	public ModelAndView verifyCourseDetail(@ModelAttribute AddCourse course ,AddCourse addcourse) {
		
		System.out.println("in add course detail method ");
		ModelAndView model_object=new ModelAndView();
		//model_object.addObject("addcourse", addcourse);
		this.courseService.add_course(addcourse);
		model_object.setViewName("showdetail");
		
		return model_object;
		
	}
	
	@GetMapping("/loadall")
	public ModelAndView loadAll() {
		System.out.println("in loading page...");
		ModelAndView object=new ModelAndView();
		List<AddCourse> courses=courseService.get_all_courses();
		object.addObject("course_list", courses);
		object.setViewName("allcourses");

		return object;
	}
	

}
