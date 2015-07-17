package com.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dashboard.bean.UserBean;
import com.dashboard.service.UserService;

@Controller
@Configuration
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("User/index");
	}
	
	
	//Testing purposes..
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView Test() {
		return new ModelAndView("Test/index");
	}
	
	@RequestMapping(value = "/testsave", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("command") UserBean userBean, 
			BindingResult result) {
		UserBean user = prepareModel(userBean);
		userService.addUser(user);
		//return new ModelAndView("redirect:/Test/show");
		return new ModelAndView("Test/show");
	}

	private UserBean prepareModel(UserBean userBean) {
		UserBean bean = new UserBean();
		bean.setFirstName(userBean.getFirstName());
		bean.setLastName(userBean.getLastName());
		bean.setEmail(userBean.getEmail());
		bean.setPassword(userBean.getPassword());
		bean.setRole(userBean.getRole());
		return bean;
	}


}
