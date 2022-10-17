package controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//make our java class as controller class which responsible to handle request
@Controller
public class FrontController {
	
	//This annotation handle the request and return index.jsp in response
	//handler method
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is Front Controller Response");
		return "index";
	}
	//handler method :http://localhost:8080/spring_mvc1/bymodel request
	@RequestMapping("/bymodel")
	public String byModel(Model model) {
		System.out.println("This is Front Controller response data send from controller to view by model");
		model.addAttribute("name","Akshay");//sending data from controller to view by Model
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(49);
		marks.add(59);
		marks.add(89);
		marks.add(67);

		model.addAttribute("marks",marks);
		
		return "model";
	}
	//handler method http://localhost:8080/spring_mvc1/bymodelandview to handle this url
	@RequestMapping("/bymodelandview")
	public ModelAndView byModelandView() {
		System.out.println("This is Front Controller response data send from controller to view by model and view");
		//creating modelAndview to set data and get it in view page
		ModelAndView object=new ModelAndView();
		object.addObject("id", 101);//data to be pass from controller by ModelAndView object
		object.addObject("name", "Akshay");
		ArrayList<String> list=new ArrayList<String>();
		list.add("Rahul");
		list.add("Sujit");
		list.add("Vinayak");
		object.addObject("list", list);
		object.setViewName("modelandview");//set view name where data to be passed modelandview.jsp
		
		return object;//modelAndView return its object
	}
	
	

}
