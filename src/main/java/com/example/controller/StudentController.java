package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") //URL接頭辞
public class StudentController {
	
	@GetMapping("/index")
	public String getStudentIndex() {
		return "student/student_index";
	}
}
