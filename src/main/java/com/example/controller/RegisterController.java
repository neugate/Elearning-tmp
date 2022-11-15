package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register") //URL接頭辞
public class RegisterController {

	@GetMapping("/form")
	public String getForm() {
		return "register/form";
	}

	@PostMapping("/confirm")
	public String postConfirm() {
		return "register/confirm";
	}

	@PostMapping("/success")
	public String postSuccess() {
		return "register/register_success";
	}
	@GetMapping("/reissue")
	public String getReissue() {
		return "register/reissue";
	}
	
	@PostMapping("/ressue-success")
	public String postReissueSuccess() {
		return "register/ressue_success";
	}
}
