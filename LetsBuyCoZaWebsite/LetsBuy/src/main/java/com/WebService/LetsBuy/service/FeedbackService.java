package com.WebService.LetsBuy.service;

import com.WebService.LetsBuy.model.Feedback;
import com.WebService.LetsBuy.web.dto.FeedbackRegistrationDto;

public interface FeedbackService {

	Feedback save(FeedbackRegistrationDto registration);
}
