package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") //URL接頭辞
public class StudentController {
	/**  なんとなくダミーページ(iframe用)   */
	@GetMapping("/dummy1")
	public String getDummy1() {
		return "student/dummy1";
	}

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

	/**  日記編集ゲットVer作っちゃいました   */
	@GetMapping("/diary-edit")
	public String getDiaryEdit() {
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

	@GetMapping("/qualification-edit")
	public String getQualificationEdit() {
		return "student/qualification_edit";
	}

	@GetMapping("/jobsituation-edit")
	public String getJobsituationEdit() {
		return "student/jobsituation_edit";
	}

	@GetMapping("/account-detail")
	public String getAccountDetail() {
		return "student/account_detail";
	}

	@GetMapping("/qualification-detail")
	public String getQualificationDetail() {
		return "student/qualification_detail";
	}

	@GetMapping("/jobsituation-detail")
	public String getJobsituationDetail() {
		return "student/jobsituation_detail";
	}

	@GetMapping("/watch-video")
	public String getWatchVideo() {
		return "student/watch_video";
	}

	@GetMapping("/video-search")
	public String getVideoSearch() {
		return "student/video_search";
	}

	@GetMapping("/take-test")
	public String getTakeTest() {
		return "student/take_test";
	}
}
