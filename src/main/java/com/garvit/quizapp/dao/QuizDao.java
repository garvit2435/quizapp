package com.garvit.quizapp.dao;


import com.garvit.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
