package com.WebService.LetsBuy.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebService.LetsBuy.service.FeedbackService;
import com.WebService.LetsBuy.web.dto.FeedbackRegistrationDto;

@Controller
@RequestMapping("/feedback")
public class FeedbackRegistrationController {
	@Autowired
	private FeedbackService FeedbackService;

	@ModelAttribute("feedback")
	public FeedbackRegistrationDto FeedbackRegistrationDto() {
		return new FeedbackRegistrationDto();
	}

	@GetMapping
	public String showRegistrationForm(Model model) {
		return "feedback";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("feedback") @Valid FeedbackRegistrationDto FeedbackDto,
			BindingResult result) {

		FeedbackService.save(FeedbackDto);
		return "redirect:/feedback?success";
	}
}
