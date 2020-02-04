package com.WebService.LetsBuy.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebService.LetsBuy.model.Feedback;
import com.WebService.LetsBuy.repository.FeedbackRepository;
import com.WebService.LetsBuy.service.FeedbackService;
import com.WebService.LetsBuy.web.dto.FeedbackRegistrationDto;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	public Feedback save(FeedbackRegistrationDto registration) {
		Feedback feedback = new Feedback();

		feedback.setFeedbackName(registration.getFeedbackName());
		feedback.setFeedbackSurname(registration.getFeedbackSurname());
		feedback.setFeedbackEmail(registration.getFeedbackEmail());
		feedback.setFeedbackContents(registration.getFeedbackContents());
		return feedbackRepository.save(feedback);
	}

}