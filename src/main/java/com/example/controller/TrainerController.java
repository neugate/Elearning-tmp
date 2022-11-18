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
	
	@GetMapping("/detail-student")
	public String getDetailStudent() {
		return "trainer/detail_student";
	}
	
	@GetMapping("/student-profile")
	public String getStudentProfaile() {
		return "trainer/student_profile";
	}
	
	@GetMapping("/jobsituation")
	public String getJobsituation() {
		return "trainer/jobsituation";
	}
	@GetMapping("/content-status")
	public String getContentStatus() {
		return "trainer/content_status";
	}
	
	
	@GetMapping("/report-check")
	public String getReportCheck() {
		return "trainer/report_check";
	}
	
	@GetMapping("/my-test")
	public String getMyTest() {
		return "trainer/my_test";
	}
	
	
	@GetMapping("/create-test-form")
	public String postCreateTestForm() {
		return "trainer/create_test_form";
	}
	
	@PostMapping("/create-test-confirm")
	public String getCreateTestConfirm() {
		return "trainer/create_test_confirm";
	}
	@GetMapping("/detail-test")
	public String getDetailTest() {
		return "trainer/detail_test";
	}
	
	@PostMapping("/success")
	public String getSuccess() {
		return "trainer/success";
	}
	
	@GetMapping("/my-video")
	public String getMyVideo() {
		return "video/my_video";
	}
	
	@GetMapping("/add-video")
	public String getAddVideo() {
		return "video/add_video";
	}
	
	@GetMapping("/trainer-account")
	public String getTrainerAccount() {
		return "trainer/trainer_account";
	}
	
	@GetMapping("/trainer-edit")
	public String getTrainerEdit() {
		return "trainer/trainer_edit";
	}
	
	
	
}