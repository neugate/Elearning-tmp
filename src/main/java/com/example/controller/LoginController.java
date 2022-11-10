package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@GetMapping("/index")
	public String getIndex() {
		return "login/index";
	}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "login/login_form";
	}

	@PostMapping("/login/success")
	public String getLoginSucsess() {
		return "login/login_success";
	}

	@GetMapping("/logout")
	public String getLogout() {
		return "login/logout_success";
	}

}
