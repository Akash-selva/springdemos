package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "addUser",method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest req, User user) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		float salary = Float.parseFloat(req.getParameter("salary"));
		
		user.setId(id);
		user.setName(name);
		user.setSalary(salary);
		
		String result = userservice.addUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("add.jsp");
		return mav;
	}
	
	@RequestMapping(value = "updateDetails",method = RequestMethod.POST)
	public ModelAndView updateDetails(HttpServletRequest req, User user) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		float salary = Float.parseFloat(req.getParameter("salary"));
		
		
		user.setId(id);
		user.setName(name);
		user.setSalary(salary);
		
		String result = userservice.updateUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("update.jsp");
		return mav;
	}
	
	@RequestMapping(value = "findUser",method = RequestMethod.GET)
	public ModelAndView findAllProduct() {
		List<User> listOfUser = userservice.getAllUser();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfUser", listOfUser);				// requestScope.setAttribute 
		mav.setViewName("retrieve.jsp");
		return mav;
	}
	
	

}
