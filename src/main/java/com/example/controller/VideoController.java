package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/video") //URL接頭辞
public class VideoController {

	@GetMapping("/watch-video")
	public String getWatchVideo() {
		return "video/watch_video";
	}
	
	@GetMapping("/video-search")
	public String getVideoSearch() {
		return "video/video_search";
	}
	
	
}
