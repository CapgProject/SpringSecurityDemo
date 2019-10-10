package com.cg.demosecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.demosecurity.dto.User;
import com.cg.demosecurity.service.UserService;

@Controller
public class DemoController {

	
	@GetMapping(value = "/")
	public String myHome() {
		return "LoginPage";
	}
	@GetMapping(value = "/admin")
	public String myAdmin() {
		return "AdminPage";
	}
	@GetMapping(value = "/user")
	public String myUser() {
		return "UserPage";
	}
}
