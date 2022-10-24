package controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pojo.Application;
import service.ApplicationService;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private ApplicationService appService;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("in Home controller getting index page ");
		return "index";
		//return "redirect:http://www.google.com";
		
		/*redirect:/home/form
		 * it simply redirect your /home/ request to /home/form instead of getting index.jsp page directly open form.jsp
		 * because your URL is redirect using Redirect Prefix
		 */

	}
	

	@RequestMapping("/form")
	public String form() {
		System.out.println("In a form controller...");

		return "/form";
	}

	// to map /home/verify request from client after submitting form
	// because form action associated with this request
	/*
	 * This is regular method in servlet to get data from view to controller which
	 * used spring mvc HttpServletRequest class object used to get data from view to
	 * controller ****METHOD --1
	 * 
	 * @RequestMapping(path="/verify",method=RequestMethod.POST) public ModelAndView
	 * verifyForm(HttpServletRequest request) { ModelAndView
	 * object=newModelAndView(); String name=request.getParameter("name");
	 * System.out.println("Your name is : "+name); object.addObject("name", name);
	 * String email=request.getParameter("email");
	 * System.out.println("Your Email is : "+email); object.addObject("email",
	 * email); String password=request.getParameter("password");
	 * System.out.println("Your Password is : "+password);
	 * object.addObject("password", password); object.setViewName("output");//return
	 * this data to this view return object;
	 * 
	 * }
	 */

	/*
	 * 
	 * @RequestParam used to get value of specific field from view page stored it in
	 * local controller variable
	 * 
	 * @RequestParam("email") String u_email Here,email is view page field whose
	 * value store in u_email
	 */
	// METHOD --2

//	@RequestMapping(path = "/verify", method = RequestMethod.POST)
//	public ModelAndView verifyForm(@RequestParam("email") String u_email, @RequestParam("name") String u_name,
//			@RequestParam("password") String u_password, @RequestParam("phone") String u_dob,
//			@RequestParam("gender") String u_gender,@RequestParam("course") String[] u_courses) {
//		ModelAndView object = new ModelAndView();
//		System.out.println("Name : " + u_name);
//		object.addObject("name", u_name);
//		System.out.println("Email : " + u_email);
//		object.addObject("email", u_email);
//		System.out.println("Password : " + u_password);
//		object.addObject("password", u_password);
//		object.addObject("dob", u_dob);
//		object.addObject("gender", u_gender);
//		System.out.println(u_courses);
//		object.addObject("options",u_courses); //pass list from view to controller
//		
//		object.setViewName("output");// return this data to this view return object;
//		return object;
//
//	}

	// METHOD --3
     //@PostMapping("/verify")
	@RequestMapping(path = "/verify", method = RequestMethod.POST)
	public ModelAndView insertApplication(@ModelAttribute Application application, ModelAndView object) {
		System.out.println(application);
		// object.addObject("application",application);
		this.appService.addApplication(application);
		object.setViewName("output");
		return object;

		/*
		 * @ModelAttribute -will bind all field to Object instead of binding single
		 * field to one variable bind it in object with this dont need use to addObject
		 * method explicity it implicitly add model attribute i.e Application class
		 * object to ModelAndView object
		 */
	}
	@RequestMapping("/login")
	public String loginForm() {
		System.out.println("In a log in controller...");

		return "/login";
	}
	
//	@PostMapping("/authenticate")
//	public  ModelAndView validateApplication(@RequestParam("email") String email,@RequestParam("password") String password) {
//		ModelAndView detail=new ModelAndView();
//		this.appService.retrieveApplication(email,password);
//		detail.setViewName("output");
//		
//		return detail;
//		
//	}

}
