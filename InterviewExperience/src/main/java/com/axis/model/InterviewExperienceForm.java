package com.axis.model;



import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="interview_experience_form")
public class InterviewExperienceForm {
@Id
private String email;
private String company;
private String role;
private String isSelected;
private String jobLocation;
private boolean postAsAnonymous;
private String applyMode;//offcampus or oncampus
private String sourceOfOffCampus;
private String eligibilityCriteria;
private int noOfRounds;
private List<Round> rounds;//Embeded Round Type
public InterviewExperienceForm() {
	
}
public InterviewExperienceForm(String email, String company, String role, String isSelected, String jobLocation,
		boolean postAsAnonymous, String applyMode, String sourceOfOffCampus, String eligibilityCriteria, int noOfRounds,
		List<Round> rounds) {
	super();
	this.email = email;
	this.company = company;
	this.role = role;
	this.isSelected = isSelected;
	this.jobLocation = jobLocation;
	this.postAsAnonymous = postAsAnonymous;
	this.applyMode = applyMode;
	this.sourceOfOffCampus = sourceOfOffCampus;
	this.eligibilityCriteria = eligibilityCriteria;
	this.noOfRounds = noOfRounds;
	this.rounds = rounds;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getIsSelected() {
	return isSelected;
}
public void setIsSelected(String isSelected) {
	this.isSelected = isSelected;
}
public String getJobLocation() {
	return jobLocation;
}
public void setJobLocation(String jobLocation) {
	this.jobLocation = jobLocation;
}
public boolean isPostAsAnonymous() {
	return postAsAnonymous;
}
public void setPostAsAnonymous(boolean postAsAnonymous) {
	this.postAsAnonymous = postAsAnonymous;
}
public String getApplyMode() {
	return applyMode;
}
public void setApplyMode(String applyMode) {
	this.applyMode = applyMode;
}
public String getSourceOfOffCampus() {
	return sourceOfOffCampus;
}
public void setSourceOfOffCampus(String sourceOfOffCampus) {
	this.sourceOfOffCampus = sourceOfOffCampus;
}
public String getEligibilityCriteria() {
	return eligibilityCriteria;
}
public void setEligibilityCriteria(String eligibilityCriteria) {
	this.eligibilityCriteria = eligibilityCriteria;
}
public int getNoOfRounds() {
	return noOfRounds;
}
public void setNoOfRounds(int noOfRounds) {
	this.noOfRounds = noOfRounds;
}
public List<Round> getRounds() {
	return rounds;
}
public void setRounds(List<Round> rounds) {
	this.rounds = rounds;
}

}
