package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/video") //URL接頭辞
public class VideoController {

	@GetMapping("/list")
	public String getVideoList() {
		return "video/list";
	}
}
