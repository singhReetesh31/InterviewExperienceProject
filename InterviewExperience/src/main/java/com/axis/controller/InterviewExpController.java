package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.InterviewExperienceForm;
import com.axis.service.IInterviewExpService;

@RestController
@RequestMapping("/interviewExp")
public class InterviewExpController {
	@Autowired
IInterviewExpService service;
	@PostMapping("/addForm")
	public void addForm(@RequestBody InterviewExperienceForm form) {
		service.addInterviewExpForm(form);
	}
	@GetMapping("/getForms")
	public ResponseEntity<List<InterviewExperienceForm>> getForms(){
		return new ResponseEntity<List<InterviewExperienceForm>>(service.getForms(),HttpStatus.OK);
	}
}
