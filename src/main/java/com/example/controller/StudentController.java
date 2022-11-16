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
	@GetMapping("/account-menu")
	public String getAccountMenu() {
		return "student/account_menu";
	}
	@GetMapping("/account-edit")
	public String getAccountEdit() {
		return "student/account_edit";
	}
	@GetMapping("/sikaku-edit")
	public String getSikakuEdit() {
		return "student/sikaku_edit";
	}
	@GetMapping("/jobsituation-edit")
	public String getJobsituationEdit() {
		return "student/jobsituation_edit";
	}
	
	@GetMapping("/account-detail")
	public String getAccountDetail() {
	    return "student/account_detail";
	}
	@GetMapping("/sikaku-detail")
	public String getSikakuDetail() {
	    return "student/sikaku_detail";
	}
	@GetMapping("/jobsituation-detail")
	public String getJobsituationDetail() {
	    return "student/jobsituation_detail";
	}

	
}
