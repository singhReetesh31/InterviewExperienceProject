package com.axis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.model.InterviewExperienceForm;

public interface IInterviewExpDao extends MongoRepository<InterviewExperienceForm, String>{

}
