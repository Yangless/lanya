package com.nwl.lanya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model){
		return "html/index1";
	}
	@RequestMapping("/login")
	public String login(Model model){
		return "html/login";
	}
}
