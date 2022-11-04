package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.LogIn;
import pojo.User;
import service.IUserSer;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	IUserSer userService;
//	@RequestMapping("/")
//	public String showHomePage() {
//		System.out.println("in show home page");
//		return "index";// logical view name , actual view name : /WEB-INF/views/index.jsp
//	}

	@RequestMapping("/")
	public String homeHandler() {
		System.out.println("in home Page...");
		return "homepage";
	}

	@RequestMapping(path = "/signup", method = RequestMethod.POST)
	public String signupHandler() {
		System.out.println("in signup form to add acount..");
		return "/user/signup";
	}

	@RequestMapping(path = "/adduser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User userReq, User user) {
		ModelAndView object = new ModelAndView();

		object.addObject("userRes", user);
		this.userService.addUser(user);
		object.setViewName("viewuser");

		return object;
	}

	@RequestMapping("/login")
	public ModelAndView loginHandler(@ModelAttribute LogIn loginRes, LogIn login,HttpSession session) {
		ModelAndView object = new ModelAndView();
		User u = this.userService.validateUser(login);
		System.out.println(u);
		object.addObject("user", u);
		object.setViewName("validate");

		return object;
	}

	@RequestMapping("/addAcc")

	public String addAccount() {
		System.out.println("in account handler");
		return "account/addAcc";
	}
}
