package com.davidfiden.ada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {
	
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("\n\n\n\n\n\nSDave");
		model.addAttribute("message", "Hello World!");
		return "index";
	}

}
