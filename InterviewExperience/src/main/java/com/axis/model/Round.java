package com.axis.model;



import java.sql.Date;

public class Round {
	private String roundType;
	private int levelOfDifficulty;
	//@JsonFormat(pattern = "yyyy-MM-dd", shape=JsonFormat.Shape.STRING)
	//@Temporal(TemporalType.DATE)
	private Date date;
	private double duration;
	private String testPlatform;
	private int noOfQuestions;
	private String questionDescription;
	private String preperationTips;
	public Round() {
		
	}
	public Round(String roundType, int levelOfDifficulty, Date date, double duration, String testPlatform,
			int noOfQuestions, String questionDescription, String preperationTips) {
		super();
		
		this.roundType = roundType;
		this.levelOfDifficulty = levelOfDifficulty;
		this.date = date;
		this.duration = duration;
		this.testPlatform = testPlatform;
		this.noOfQuestions = noOfQuestions;
		this.questionDescription = questionDescription;
		this.preperationTips = preperationTips;
	}
	
	public String getRoundType() {
		return roundType;
	}
	public void setRoundType(String roundType) {
		this.roundType = roundType;
	}
	public int getLevelOfDifficulty() {
		return levelOfDifficulty;
	}
	public void setLevelOfDifficulty(int levelOfDifficulty) {
		this.levelOfDifficulty = levelOfDifficulty;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getTestPlatform() {
		return testPlatform;
	}
	public void setTestPlatform(String testPlatform) {
		this.testPlatform = testPlatform;
	}
	public int getNoOfQuestions() {
		return noOfQuestions;
	}
	public void setNoOfQuestions(int noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public String getPreperationTips() {
		return preperationTips;
	}
	public void setPreperationTips(String preperationTips) {
		this.preperationTips = preperationTips;
	}
	
}
