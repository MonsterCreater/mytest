package com.gec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gec.pojo.User;
import com.gec.service.UserService;

@Controller
@RequestMapping("/user")
public class UserServlet {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/loginpage")
	public String loginpage(){
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView userLogin(User user){
		ModelAndView mav = new ModelAndView();
		user = userService.login(user);
		if (user!=null) {
			mav.setViewName("welcome");
		}
		return mav;
	}
}
