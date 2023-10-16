package com.garvit.quizapp.dao;

import com.garvit.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

//To save time from fetching data from sql queries, we use interface here
// and implement the JpaRepository<class/table name, primary key data type>
public interface QuestionDao extends JpaRepository<Question, Integer> {


    List<Question> findByCategory(String category);

   // @Query(value = " SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
   // List<Question> findRandomQuestionsByCategory(String category, int numQ);
   @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
   List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
}

