package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Course_Controller {
	
	@RequestMapping("/spring_core")
	public String springHandler() {
		System.out.println("In Spring Handler");
		return "/spring";
	}
	@RequestMapping("/hibernate")
	public String hibernateHandler() {
		System.out.println("In hibernate Handler");
		return "hibernate";
	}
	@RequestMapping("/jsp")
	public String jspHandler() {
		System.out.println("In jsp Handler");
		return "jsp";
	}
	@RequestMapping("/servlet")
	public String servletHandler() {
		System.out.println("In Servlet Handler");
		return "servlet";
	}

}
