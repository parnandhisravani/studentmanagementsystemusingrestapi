package com.spring.student_management_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.student_management_system.entity.StudentScoreCard;

public interface StudentScoreCardRepository extends JpaRepository<StudentScoreCard, Integer> {
 

}

