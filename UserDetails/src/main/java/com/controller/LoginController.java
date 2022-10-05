package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="checkuser",method= RequestMethod.GET)
	public ModelAndView checkUsertDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		ModelAndView mav=new ModelAndView();
		if(email.contentEquals("admin@gmail.com")&& password.equals("123")) {
			mav.setViewName("Home.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}