package com.WebService.LetsBuy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WebService.LetsBuy.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserEmail(String userEmail);
}