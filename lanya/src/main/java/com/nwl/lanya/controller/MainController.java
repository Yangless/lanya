package com.nwl.lanya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model){
		return "html/index";
	}
	@RequestMapping("/login")
	public String login(Model model){
		return "html/login";
	}

	@RequestMapping("/boutique")
	public String boutique(Model model){
		return "html/boutique";
	}

	
	
	@RequestMapping("/sourceDetail")
	public String sourceDetail(String id,Model model){
		model.addAttribute("id", id);
		return "html/sourceDetail";
	}
	
}
