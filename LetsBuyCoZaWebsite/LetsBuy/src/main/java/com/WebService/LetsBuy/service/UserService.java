package com.WebService.LetsBuy.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.WebService.LetsBuy.model.User;
import com.WebService.LetsBuy.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User findByUserEmail(String userEmail);

	User save(UserRegistrationDto registration);
}
