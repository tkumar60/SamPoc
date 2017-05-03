package com.uhg.naveen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.uhg.naveen.beans.Employee;

@Controller
public class HelloController {
	@RequestMapping(value="/HelloPage")
	public ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse responce) throws Exception{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User, Welcome to SamplePOC");
		return modelandview;
	}
	
	@RequestMapping(value="/getEmployee")
	public ModelAndView getEmployee(HttpServletRequest request,HttpServletResponse responce) throws Exception{
		ModelAndView modelandview = new ModelAndView("employeeDetails");
		Employee emp = new Employee();
		emp.setName("Naveen");
		modelandview.addObject("employee",emp);
		return modelandview;
	}
	

}
