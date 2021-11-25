package com.axis.service;

import java.util.List;

import com.axis.model.InterviewExperienceForm;

public interface IInterviewExpService {
void addInterviewExpForm(InterviewExperienceForm form);
List<InterviewExperienceForm> getForms(); 
}
