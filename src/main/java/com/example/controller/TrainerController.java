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
	
	@GetMapping("/student-detail")
	public String getStudentDetail() {
		return "trainer/student_detail";
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
	
	@GetMapping("/report-list")
	public String getReporList() {
		return "trainer/report_list";
	}
	
	@GetMapping("/report-all")
	public String getReporAll() {
		return "trainer/report_all";
	}
	
	@GetMapping("/report-detail")
	public String getReportDetail() {
		return "trainer/report_detail";
	}
	
	@GetMapping("/my-test")
	public String getMyTest() {
		return "trainer/my_test";
	}
	
	@GetMapping("/test-index")
	public String getTestindex() {
		return "trainer/test_index";
	}
	
	
	@GetMapping("/test-result")
	public String getTestResult() {
		return "trainer/test_result";
	}
	
	@GetMapping("/test-list")
	public String getTestlist() {
		return "trainer/test_list";
	}
	
	@GetMapping("/test-form")
	public String postTestForm() {
		return "trainer/test_form";
	}
	
	@PostMapping("/test-confirm")
	public String getTestConfirm() {
		return "trainer/test_confirm";
	}
	@GetMapping("/test-detail")
	public String getTestDetail() {
		return "trainer/test_detail";
	}
	@GetMapping("/test-edit")
	public String getTestEdit() {
		return "trainer/test_edit";
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
	
	@PostMapping("/success")
	public String getSuccess() {
		return "trainer/success";
	}
	@PostMapping("/update")
	public String getupdate() {
		return "trainer/update";
	}
	
	@GetMapping("/delete")
	public String getDelete() {
		return "trainer/delete";
	}
	
	
	
}