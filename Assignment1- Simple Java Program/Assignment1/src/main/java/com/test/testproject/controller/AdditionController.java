package com.test.testproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	
	@RequestMapping(value="/add")
	public ModelAndView addNumbers(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		int a=Integer.parseInt(request.getParameter("t1"));
		int b=Integer.parseInt(request.getParameter("t2"));
		int c=a+b;
		mv.addObject("result",c);
		mv.setViewName("add-result");
		return mv;
	}
}
