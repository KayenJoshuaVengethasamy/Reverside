package com.WebService.LetsBuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebService.LetsBuy.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserEmail(String userEmail);
}