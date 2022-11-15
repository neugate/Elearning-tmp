package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trainer") //URL接頭辞
public class TrainerController {
		
	@GetMapping("/index")
	public String getTrainerIndex() {
		return "trainer/trainer_index";
	}
	
	@GetMapping("/student-list")
	public String getStudentList() {
		return "trainer/student_list";
	}
	
	@GetMapping("/report-check")
	public String getReportCheck() {
		return "trainer/report_check";
	}
	
	@GetMapping("/student-list/detail-student")
	public String getDetailStudent() {
		return "trainer/detail_student";
	}
	
	@GetMapping("/create-test-form")
	public String getCreateTestForm() {
		return "/create_test_form";
	}
	
	@GetMapping("/my-video")
	public String getMyVideo() {
		return "/my_video";
	}
	
	@GetMapping("trainer-account")
	public String getTrainerAccount() {
		return "/trainer_account";
	}
	
	
}