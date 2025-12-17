package com.demo.Day24_postlunch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("/")
	public String loginPage() {
		return "login";
		}
	
	@PostMapping("/login")
	public String login(@RequestParam String uname , @RequestParam String pass, Model model) {
		if(uname.equals("Bhanu")  && pass.equals("kaadu")) {
			model.addAttribute("uname", uname);
			return "welcome";
		}
		else return "error";
					
	}

}
