package com.nagarro.assignment.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.assignment.dao.DaoServicesImpl;
import com.nagarro.assignment.model.FlightUser;

@Controller
public class Login {

	@RequestMapping("/login")
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		@SuppressWarnings("resource")
		
		FlightUser user1 = new  FlightUser("sapna123","123","suman singh");
		DaoServicesImpl dao = new DaoServicesImpl();
		dao.insertUser(user1);
		System.out.println("object inserted");
		
		ModelAndView mv = new ModelAndView();
		System.out.println("this is home url");
		mv.setViewName("login");

		return mv;

	}

	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (!(username.equals("suman") && password.equals("123"))) {
			mv.setViewName("login");
			return mv;
		}

		mv.setViewName("Flights");
		return mv;

	}

	@RequestMapping("/register")
	public ModelAndView reset(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();

		System.out.println("register here");
		mv.setViewName("register");

		return mv;
	}

}
