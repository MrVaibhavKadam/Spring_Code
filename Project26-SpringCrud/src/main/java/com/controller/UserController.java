package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/user")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}

	@RequestMapping("/")
	public String home() {
		return "redirect:/user"; // redirect to user form
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("user") User user) {
		service.addUser(user);
		return "userForm";
	}

}
