package com.WebService.LetsBuy.service.implementations;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.WebService.LetsBuy.model.Role;
import com.WebService.LetsBuy.model.User;
import com.WebService.LetsBuy.repository.UserRepository;
import com.WebService.LetsBuy.service.UserService;
import com.WebService.LetsBuy.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public User findByUserEmail(String userEmail) {
		return userRepository.findByUserEmail(userEmail);
	}

	public User save(UserRegistrationDto registration) {
		User user = new User();
		user.setUserFirstName(registration.getFirstName());
		user.setUserLastName(registration.getLastName());
		user.setUserEmail(registration.getEmail());
		user.setUserPassword(passwordEncoder.encode(registration.getPassword()));
		user.setRoles(Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByUserEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserEmail(), user.getUserPassword(),
				mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
	}
}