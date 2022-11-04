package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.LogIn;
import pojo.User;
import service.IUserSer;

@Controller
public class AccountController {

	@Autowired
	IUserSer userService;
	
	
	

}
