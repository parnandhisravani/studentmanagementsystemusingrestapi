package com.spring.student_management_system.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student_management_system.entity.Student;
import com.spring.student_management_system.entity.StudentScoreCard;
import com.spring.student_management_system.service.StudentScoreCardService;
import com.spring.student_management_system.service.StudentService;

@RestController
public class StudentScoreCardController {
	@Autowired
	private StudentService studentservice;
	@Autowired
	private StudentScoreCardService studentscorecardservice;

	
	@GetMapping("/studentscorelist")
	public List<StudentScoreCard> getStudentScoreCard() {
		return this.studentscorecardservice.getAllStudentScoreCard();
	}

	@GetMapping("/studentscore/{Score_Id}")
	public StudentScoreCard findstudentscorebyId(@PathVariable("Score_Id") int Score_Id) {
		return this.studentscorecardservice.searchbyId(Score_Id);
	}

	@PostMapping("/addstudentscore/{id}")
	public String addstudentscore(@RequestBody StudentScoreCard studentscore,@PathVariable int id) {
		Student s= this.studentservice.searchbyId(id);
		studentscore.setStudent(s);
		 this.studentscorecardservice.addstudentscore(studentscore);
		 return "Studentscore added";
	}

	@PutMapping("/updatestudentscorebyid/{Score_Id}")
	public StudentScoreCard updatestudentscore(@RequestBody StudentScoreCard studentscore,@PathVariable int Score_Id) {
		studentscorecardservice.updatestudentscore(studentscore, Score_Id);
		return studentscore;
	}

	@DeleteMapping("/deletestudentscore/{Score_Id}")
	public void deleteStudentscorebyid(@PathVariable("Score_Id") int Score_Id)
	{
		studentscorecardservice.deletestudentscoreById(Score_Id);
		 }
}

