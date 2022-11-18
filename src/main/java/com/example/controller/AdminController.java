package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin") //URL接頭辞
public class AdminController {

	@GetMapping("/index")
	public String getAdmin() {
		return "admin/admin_index";
	}
	
	@GetMapping("/student-list")
	public String getStudentList() {
		return "admin/student_list";
	}
	@GetMapping("/student-profile")
	public String getStudentprofile() {
		return "admin/student_profile";
	}
	@GetMapping("/student-detail")
	public String getlStudentDetail() {
		return "admin/student_detail";
	}
	@GetMapping("/account-edit")
	public String getAccountEdit() {
		return "admin/account_edit";
	}
	@GetMapping("/account-delete")
	public String getAccountDelete() {
		return "admin/account_delete";
	}
	@GetMapping("/delete-success")
	public String getDeleteSuccess() {
		return "admin/delete_success";
	}
	@GetMapping("/trainer-list")
	public String getTrainerList() {
		return "admin/trainer_list";
	}
	
	@GetMapping("/detail-trainer")
	public String getDetailTrainer() {
		return "admin/detail_trainer";
	}
	@GetMapping("/report-list")
	public String getrepotList() {
		return "admin/report_list";
	}
	
	
}
