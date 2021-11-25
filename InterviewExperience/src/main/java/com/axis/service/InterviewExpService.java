package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dao.IInterviewExpDao;
import com.axis.model.InterviewExperienceForm;
@Service
public class InterviewExpService implements IInterviewExpService{
	@Autowired
IInterviewExpDao dao;
	@Override
	public void addInterviewExpForm(InterviewExperienceForm form) {
		dao.save(form);
	}

	@Override
	public List<InterviewExperienceForm> getForms() {
		return dao.findAll();
	}

}
