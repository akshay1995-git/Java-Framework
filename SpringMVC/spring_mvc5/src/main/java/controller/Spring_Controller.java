package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import service.ICourseService;

@Controller
@RequestMapping("/spring")
public class Spring_Controller {
	
	@Autowired
	ICourseService courseService;
	
	@GetMapping("/spring_core")
	public String spring_coreHandler() {
		System.out.println("in spring core handler");
		return "spring/spring_core";
	}
	@GetMapping("/spring_mvc")
	public String spring_mvcHandler() {
		System.out.println("in spring core handler");
		return "spring/spring_mvc";
	}
	@GetMapping("/spring_boot")
	public String spring_bootHandler() {
		System.out.println("in spring core handler");
		return "spring/spring_boot";
	}

}
