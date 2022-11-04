package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {


		@RequestMapping("/")
		public String homeHandler() {
			System.out.println("in home handler...");
			//return "Welcome to Spring Boot";
			return "home";
		}
}
