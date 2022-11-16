package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/video") //URL接頭辞
public class VideoController {

	@GetMapping("/my-video")
	public String getMyVideo() {
		return "my_video";
	}
	
	@GetMapping("/add-video")
	public String getAddVideo() {
		return "add_video";
	}
	
	
}
