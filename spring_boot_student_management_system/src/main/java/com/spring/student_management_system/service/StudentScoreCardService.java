package com.spring.student_management_system.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.student_management_system.entity.StudentScoreCard;
import com.spring.student_management_system.repository.StudentScoreCardRepository;

@Service
@Transactional
public class StudentScoreCardService {
	@Autowired
	private StudentScoreCardRepository studentscorecardrepository;

	public List<StudentScoreCard> getAllStudentScoreCard() {
		return studentscorecardrepository.findAll();
	}

	public StudentScoreCard searchbyId(int Score_Id) {
		return studentscorecardrepository.findById(Score_Id).get();
	}

	public StudentScoreCard addstudentscore(StudentScoreCard studentscore) {
		return studentscorecardrepository.save(studentscore);
	}

	public StudentScoreCard updatestudentscore(StudentScoreCard studentscore, int Score_Id) {
		return studentscorecardrepository.save(studentscore);
	}
	public void deletestudentscoreById(int Score_Id) {
		studentscorecardrepository.deleteById(Score_Id);
		
	}
	
}


