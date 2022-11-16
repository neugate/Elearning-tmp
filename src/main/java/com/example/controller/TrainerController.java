package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String postCreateTestForm() {
		return "trainer/create_test_form";
	}
	
	@PostMapping("/create-test-confirm")
	public String getCreateTestConfirm() {
		return "trainer/create_test_confirm";
	}
	
	@GetMapping("/my-video")
	public String getMyVideo() {
		return "video/my_video";
	}
	
	@GetMapping("trainer-account")
	public String getTrainerAccount() {
		return "trainer/trainer_account";
	}
	
	
}