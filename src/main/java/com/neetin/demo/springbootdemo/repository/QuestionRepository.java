package com.neetin.demo.springbootdemo.repository;

import com.neetin.demo.springbootdemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}