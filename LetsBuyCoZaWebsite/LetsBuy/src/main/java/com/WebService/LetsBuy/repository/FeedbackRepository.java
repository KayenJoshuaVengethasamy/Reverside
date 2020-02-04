package com.WebService.LetsBuy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WebService.LetsBuy.model.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long> {

}