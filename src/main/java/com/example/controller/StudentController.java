package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") //URL接頭辞
public class StudentController {
	
	@GetMapping("/index")
	public String getStudentIndex() {
		return "student/student_index";
	}
	
	@GetMapping("/diary-list")
	public String getDiaryList() {
		return "student/diary_list";
	}
	
	@PostMapping("/diary-edit")
	public String postDiaryEdit() {
		return "student/diary_edit";
	}
	
	@GetMapping("/test-list")
	public String getTestList() {
		return "student/test_list";
	}
	
}
