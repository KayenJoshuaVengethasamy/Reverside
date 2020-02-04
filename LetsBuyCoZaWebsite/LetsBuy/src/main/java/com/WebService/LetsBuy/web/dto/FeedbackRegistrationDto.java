package com.WebService.LetsBuy.web.dto;

import javax.validation.constraints.NotEmpty;

public class FeedbackRegistrationDto {

	private String feedbackName;

	private String feedbackSurname;

	@NotEmpty
	private String feedbackEmail;
	@NotEmpty
	private String feedbackContents;
	
	
	public String getFeedbackName() {
		return feedbackName;
	}
	public void setFeedbackName(String feedbackName) {
		this.feedbackName = feedbackName;
	}
	public String getFeedbackSurname() {
		return feedbackSurname;
	}
	public void setFeedbackSurname(String feedbackSurname) {
		this.feedbackSurname = feedbackSurname;
	}
	public String getFeedbackEmail() {
		return feedbackEmail;
	}
	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}
	public String getFeedbackContents() {
		return feedbackContents;
	}
	public void setFeedbackContents(String feedbackContents) {
		this.feedbackContents = feedbackContents;
	}
	
	

}
